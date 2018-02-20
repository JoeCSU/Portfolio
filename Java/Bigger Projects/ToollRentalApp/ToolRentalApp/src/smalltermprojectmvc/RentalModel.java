/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smalltermprojectmvc;

/**
 *
 * @author Joe Antonacci
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class RentalModel implements RentalModelInterface, RentalObservableInterface {
    private ArrayList<RentalObserver> observers = new ArrayList();
    private File customers = null;
    private File tools = null;
    private File rentalData = null;
    int submitAction;
    String message = null;
    
    @Override
    public void setCustomers(File customers){
        this.customers = customers;
    }
    
    @Override
    public void setTools(File tools) {
        this.tools = tools;
    }
    
    @Override
    public void setRentalData(File rentalData) {
        this.rentalData = rentalData;
    }
    
    @Override
    public File getCustomers(){
        return customers;
    }
        
    @Override
    public File getTools() {
        return tools;
    }
    
    @Override
    public File getRentalData() {
        return rentalData;
    }
    
    @Override
    public void registerObserver(RentalObserver o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(RentalObserver o) {
        int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }
    }
    
    @Override
    public void updateObservers() {
        for (RentalObserver observer : observers) {
            observer.update();
        }
    }
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    @Override
    public void setAction(int action){
        this.submitAction = action;
    }
    
    public int getAction(){
        return this.submitAction;
    }
    
    @Override
    public void setData(InitialView view) {
        final JFileChooser fc = new JFileChooser();
        File[] files;
        ArrayList<File> filesArray = new ArrayList();
        fc.setMultiSelectionEnabled(true);
        fc.showOpenDialog(view);
        files = fc.getSelectedFiles();
                
        for (File file : files) {
                filesArray.add(file);}     
                        
        Iterator<File> iter = filesArray.iterator();

        while (iter.hasNext()) {
            File file = iter.next();
            if (file.getName().equals("Customers.txt")) {     
                this.setCustomers(file);}
            else if (file.getName().equals("tools.txt")) {
                this.setTools(file);}
            else if (file.getName().equals("rental_data.txt")) {
                this.setRentalData(file);}
            else {
                iter.remove();    
            }
        }
        updateObservers();         
    }
    
    @Override
    public void createCustomer(String name) throws IOException {
     
        File file = this.customers;
        int id = 0;
        int maxId = 0;

        Scanner input = new Scanner(file);
        if (!input.hasNext()){
            maxId = -1;
        }
        else{
            while(input.hasNext()) {
            String nextLine = input.nextLine();
            System.out.println(nextLine);
            String num = nextLine.substring(0, nextLine.indexOf(";"));
            id = Integer.parseInt(num);
            maxId = id;
            System.out.println(maxId);
            }
        input.close();
        }    
        id = maxId + 1;
        FileWriter fw = new FileWriter(customers, true); 
        PrintWriter pw = new PrintWriter(fw, true);
        pw.println(id + ";" + name + ";" + 0);
        pw.close();
        message = "customer created";
        setMessage(message);        
        updateObservers();
    }
    
    @Override
    public void deleteCustomer(int id) throws IOException {
        File file = this.customers;
        Scanner scanner = new Scanner(file);
        String nextLine = "";
        String newLine;
        Boolean found = false;
        ArrayList<String> lines = new ArrayList();
        if ((scanner.hasNext()) == false){
            message = "No customers to delete!";
        }
        else{
            while (scanner.hasNext()) {
                nextLine = scanner.nextLine();
                String num = nextLine.substring(0, nextLine.indexOf(";"));
                int rightId = Integer.parseInt(num);
                if (rightId == id){
                    newLine = nextLine.substring(0, (nextLine.lastIndexOf(";")+1));
                    lines.add(newLine + "1");
                    found = true;
                }
                else{
                    lines.add(nextLine);
                }
            }
        FileWriter fw = new FileWriter(file, false);
        PrintWriter pw = new PrintWriter(fw, true);
        for(String line : lines){
            pw.println(line);            
        }
        pw.close();
        if (found == true){
            message = "Customer Deleted";
        }
        else{
            message = "Customer Id not found in database";
        }
        setMessage(message);        
        updateObservers(); 
        }
    }

    @Override
    public void showAllCustomers() throws FileNotFoundException, IOException{
        File file = this.customers;
        message = "CUSTOMERS IN THE SYSTEM" + "\n" + "------------------------------------------";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
             while ((line = br.readLine()) != null) {
                message = message + "\n" + line;
             }
        }
        setMessage(message);
        updateObservers();
    }

    @Override
    public void searchTool(String tool) throws FileNotFoundException, IOException{
        File file = this.tools;
        Boolean hasTool = false;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
             while ((line = br.readLine()) != null) {
                if (line.substring(line.indexOf(";")+1, line.lastIndexOf(";")).equals(tool)){
                    hasTool = true;
                }
            }
        }catch (IOException e) {}
        if (hasTool == true) {
             message = tool + " is in the database";
             setMessage(message);
        }
        else{
            message = tool + " is not in the database";
            setMessage(message);
        }
        updateObservers();
    }
    
    @Override
    public void rentTool(String toolName, int customerId )throws FileNotFoundException, IOException {
        File customers = this.customers;
        File file = this.tools;
        File rentals = this.rentalData;
        
        GregorianCalendar date = new GregorianCalendar();
        int month = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int year = date.get(Calendar.YEAR);               

        String toolId = null;
        Boolean hasTool = false;
        Boolean isCustomer = false;
        Boolean rentable = false;
        int numRentals = 0;
        int rentalId = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(customers))) {
        String line;
             while ((line = br.readLine()) != null) {
                if (Integer.parseInt(line.substring(0, line.indexOf(";"))) == customerId && line.substring(line.lastIndexOf(";")+1, line.lastIndexOf(";")+2).equals("0")){
                    isCustomer = true;
                }
            }
        }catch (IOException e) {}
        
        try (BufferedReader br1 = new BufferedReader(new FileReader(file))) {
        String line;
             while ((line = br1.readLine()) != null) {
                if (line.substring(line.indexOf(";")+1, line.lastIndexOf(";")).equals(toolName)){
                    hasTool = true;
                    toolId = line.substring(0, line.indexOf(";"));
                }
            }
        }catch (IOException e) {}

        try (BufferedReader br2 = new BufferedReader(new FileReader(file))) {
        String line;
             while ((line = br2.readLine()) != null) {
                if (line.substring(line.lastIndexOf(";")+1, line.lastIndexOf(";") + 2).equals("0") && line.substring(line.indexOf(";")+1, line.lastIndexOf(";")).equals(toolName)){
                    rentable = true;
                }
            }
        }catch (IOException e) {}

        try (BufferedReader br3 = new BufferedReader(new FileReader(rentals))) {
        String line;
             while ((line = br3.readLine()) != null) {
                 rentalId += 1;
                 line = line.substring(line.indexOf(";")+1, line.indexOf(";", line.indexOf(";")+1));
                 if (Integer.parseInt(line) == customerId){
                     numRentals += 1;  
                 }
            }
        }catch (IOException e) {}
        
        if (isCustomer == true && hasTool == true && rentable == true && numRentals < 6){
            String nextLine = "";
            String newLine;
            Scanner scanner = new Scanner(file);
            ArrayList<String> lines = new ArrayList();
            while (scanner.hasNext()) {
                nextLine = scanner.nextLine();         
                String tool = nextLine.substring(nextLine.indexOf(";")+1, nextLine.lastIndexOf(";"));
                if (tool.equals(toolName)){
                        newLine = nextLine.substring(0, (nextLine.lastIndexOf(";")+1));
                        lines.add(newLine + "1");
                        message = toolName + " is now rented";
                        setMessage(message);
                } 
                else {
                    lines.add(nextLine);
                }               
            }
            FileWriter fw = new FileWriter(file, false);
            PrintWriter pw = new PrintWriter(fw, true);
            for(String line : lines){
                pw.println(line);            
            }
            pw.close();
            FileWriter fw1 = new FileWriter(rentals, true); 
            PrintWriter pw1 = new PrintWriter(fw1, true);
            pw1.println((rentalId+1) + ";" + customerId + ";" + toolId + ";" + month + "-" + day + "-" + year + ";" + " ");
            pw1.close();
        }
        else if (isCustomer == false) {
            message = "Customer is not registered, select \"Create Customer\" or try again" ;
            setMessage(message);
            }
        else if (hasTool == false) {
            message = "Tool not found in the database, please try again." ;
            setMessage(message);
            }
        else if (rentable == false) {
            message = "Sorry " + toolName + " is already rented, please try again." ;
            setMessage(message);
            }
        else if (numRentals > 5) {
            message = "Sorry, their is a 5 item limit per customer, please return a tool." ;
            setMessage(message);
            }
        updateObservers();  
    }
           
    @Override
    public void returnTool(String toolName)throws FileNotFoundException, IOException{
        File customers = this.customers;
        File tools = this.tools;
        File rentals = this.rentalData;
        String toolId = "";
        GregorianCalendar date = new GregorianCalendar();
        int month = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int year = date.get(Calendar.YEAR);
        Boolean isTool = false;      
        String nextLine;
        String newLine;
        Scanner scanner = new Scanner(tools);
        ArrayList<String> lines = new ArrayList();
        while (scanner.hasNext()) {
            nextLine = scanner.nextLine();         
            String tool = nextLine.substring(nextLine.indexOf(";")+1, nextLine.lastIndexOf(";"));
            if (tool.equals(toolName) && nextLine.substring(nextLine.lastIndexOf(";")+1, nextLine.lastIndexOf(";") + 2).equals("1")){    
                newLine = nextLine.substring(0, (nextLine.lastIndexOf(";")+1));
                lines.add(newLine + "0");
                isTool = true;                                           
                toolId = nextLine.substring(0, (nextLine.indexOf(";")));
                System.out.println(toolId);
                message = toolName + " is returned succesfully";
                setMessage(message);
            }
            else if (tool.equals(toolName) && nextLine.substring(nextLine.lastIndexOf(";")+1, nextLine.lastIndexOf(";") + 2).equals("0")){
                isTool = true;
                message = "Tool not rented yet, does not need to be returned"; 
                lines.add(nextLine);
            }
            else {
                lines.add(nextLine);
            }
        }   
        FileWriter fw = new FileWriter(tools, false);
        PrintWriter pw = new PrintWriter(fw, true);
        for(String line : lines){
            pw.println(line);
        }
        pw.close();
        if (isTool == false){
            message = "Tool not found in database, please try again";
            setMessage(message);
        }
        try (BufferedReader br3 = new BufferedReader(new FileReader(rentals))) {
        String line;
        ArrayList<String> lines1 = new ArrayList();
            while ((line = br3.readLine()) != null) {
                String newLine1 = "";
                String isOut = line.substring(line.lastIndexOf(";")+1, line.lastIndexOf(";")+2);
                nextLine = line.substring(line.indexOf(";", line.indexOf(";")+1)+1, line.indexOf(";", line.indexOf(";", line.indexOf(";")+1)+1));
                System.out.println(nextLine);
                if (nextLine.equals(toolId) && isOut.equals(" ")){
                    newLine = (line.substring(0, line.lastIndexOf(" ")) + month + "-" + day + "-" + year);
                    lines1.add(newLine);
                }
                else {
                    lines1.add(line);
                }
            }
            FileWriter fw1 = new FileWriter(rentals, false);
            PrintWriter pw1 = new PrintWriter(fw1, true);
            for(String line1 : lines1){
                pw1.println(line1);             
            }
        }catch (IOException e) {}
        updateObservers();
        
    }
    
    
    @Override
    public void showAllTools()throws FileNotFoundException, IOException {
        File file = this.tools;
        message = "TOOLS IN THE SYSTEM" + "\n" + "---------------------------------";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String nextLine;
             while ((nextLine = br.readLine()) != null) {
                String isRented = nextLine.substring(nextLine.lastIndexOf(";")+1, nextLine.lastIndexOf(";")+2);
                int rented = Integer.parseInt(isRented);
                if (rented == 1){
                    message = message + "\n" + nextLine;
                }
             }

        try (BufferedReader br1 = new BufferedReader(new FileReader(file))) {
        nextLine = "";
             while ((nextLine = br1.readLine()) != null) {
                String isRented = nextLine.substring(nextLine.lastIndexOf(";")+1, nextLine.lastIndexOf(";")+2);
                int rented = Integer.parseInt(isRented);
                if (rented == 0){
                    message = message + "\n" + nextLine;
                   
                }
             }
        setMessage(message);
        updateObservers();
        }
        }
    }
    
    @Override
    public void showRentedTools()throws FileNotFoundException, IOException{
        File file = this.tools;
        message = "TOOLS CURRENTLY RENTED" + "\n" + "------------------------------------------";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String nextLine;
            while ((nextLine = br.readLine()) != null) {
                String isRented = nextLine.substring(nextLine.lastIndexOf(";")+1, nextLine.lastIndexOf(";")+2);
                int rented = Integer.parseInt(isRented);
                if (rented == 1){
                    //newLine = nextLine.substring(0, (nextLine.lastIndexOf(";")+1));
                    //lines.add(newLine + "1");
                    message = message + "\n" + nextLine;
                }
            }
        }
        setMessage(message);
        updateObservers();                                      
    }
    
    @Override
    public void showRentalHistory()throws FileNotFoundException, IOException {
        File file = this.rentalData;
        message = "HISTORY OF RENTALS" + "\n" + "--------------------------------";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String nextLine;
            while ((nextLine = br.readLine()) != null) {
                    message = message + "\n" + nextLine;
            }
        }  
        setMessage(message);  // this must sort rentals by order date, ask about this
        updateObservers();                                      
    } 
    
    @Override
    public void searchCustomer(String lname, String fname) throws FileNotFoundException, IOException {
        File file = this.customers;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
             while ((line = br.readLine()) != null) {
                if (line.substring(line.indexOf(" ")+1, line.lastIndexOf(";")).equals(lname) && line.substring(line.indexOf(";")+1, line.indexOf(" ")).equals(fname)){
                     message = line;
                }
            } 
        }catch (IOException e) {}
        if (message == null) {
            message = "Customer not found";
        }
        setMessage(message);
        updateObservers();    
    }
}

    
