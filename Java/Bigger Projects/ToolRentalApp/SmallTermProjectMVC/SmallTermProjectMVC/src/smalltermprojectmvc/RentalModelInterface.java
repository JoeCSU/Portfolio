/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smalltermprojectmvc;

/**
 *
 * @author Joe
 */

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public interface RentalModelInterface {
    
    public void setCustomers(File customers);
    
    public void setTools(File tools);
    
    public void setRentalData(File rentalData);
    
    public File getCustomers();
    
    public File getTools();
    
    public File getRentalData();
    
    public void createCustomer(String name) throws IOException;
    
    public void deleteCustomer(int id) throws IOException;
    
    public void showAllCustomers() throws FileNotFoundException, IOException;
    
    public void setData(InitialView view);
    
    public void searchTool(String toolName) throws FileNotFoundException, IOException;
    
    public void rentTool(String toolName, int customerId)throws FileNotFoundException, IOException;
  
    public void returnTool(String name)throws FileNotFoundException, IOException;
    
    public void showAllTools() throws FileNotFoundException, IOException;
    
    public void showRentedTools()throws FileNotFoundException, IOException;
    
    public void showRentalHistory()throws FileNotFoundException, IOException;
    
    public void registerObserver(RentalObserver o);
    
    public void removeObserver(RentalObserver o);
    
    public void updateObservers();
    
    public void setAction(int action);
    
    public int getAction();
    
    public void searchCustomer(String lname, String fname) throws FileNotFoundException, IOException;
    
    public String getMessage();
    
    public void setMessage(String message);
}
