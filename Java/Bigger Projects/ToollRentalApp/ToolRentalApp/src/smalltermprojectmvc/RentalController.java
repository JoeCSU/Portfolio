/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smalltermprojectmvc;


import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Joe Antonacci
 */
public class RentalController implements RentalControllerInterface {
    RentalModelInterface rentalApp;
    InitialView view;
    MainView mainView;
    int submitAction;
    
    public RentalController(RentalModel rentalApp) {
        this.rentalApp = rentalApp;
        view = new InitialView(rentalApp, this);
        mainView = new MainView(rentalApp, this);
    }
        
    @Override
    public void setData(){
        rentalApp.setData(view);
    }
    
    @Override
    public void createCustomer(String name) throws IOException{
        rentalApp.createCustomer(name);
    }
    
    @Override
    public void deleteCustomer(int id) throws IOException{
        rentalApp.deleteCustomer(id);
    }
    
    @Override
    public void showAllCustomers() throws FileNotFoundException, IOException{
        rentalApp.showAllCustomers();
    }     
    
    @Override
    public void setMainView(){
        view.frame.setContentPane(mainView);
        view.frame.setVisible(true);
    }

    @Override
    public void displayInputFields(int action){
        mainView.jLabel6.setVisible(true);
        mainView.jTextField1.setVisible(true);
        mainView.jButton11.setVisible(true);
        rentalApp.setAction(action);
        if (action == 1){
            mainView.jLabel6.setVisible(false);
            mainView.jTextField1.setVisible(false);
            mainView.jButton11.setVisible(false);
        }
        if (action == 2){
            mainView.jLabel6.setVisible(false);
            mainView.jTextField1.setVisible(false);
            mainView.jButton11.setVisible(false);
        }
        if (action == 3){
            mainView.jLabel6.setVisible(false);
            mainView.jTextField1.setVisible(false);
            mainView.jButton11.setVisible(false);
        } 
        if (action == 4){
            mainView.jLabel6.setText("Enter the Customer First and Last name");}
        if (action == 5){
            mainView.jLabel6.setText("Enter the Customer ID to delete");}
        if (action == 6){
            mainView.jLabel6.setText("Enter Customer Lastname");
            mainView.jLabel8.setText("Enter Customer Firstname");
            mainView.jLabel8.setVisible(true);}
        
        if (action == 7){
            mainView.jLabel6.setVisible(false);
            mainView.jTextField1.setVisible(false);
            mainView.jButton11.setVisible(false);
        }
        if (action == 8){
            mainView.jLabel6.setText("Enter the Tool Name to search");}
        
        if (action == 9){
            mainView.jLabel6.setText("Enter the Tool Name to rent");
            mainView.jTextField2.setVisible(true);
            mainView.jLabel8.setText("Enter Customer ID");
            mainView.jLabel8.setVisible(true);
        }
        if (action == 10){
            mainView.jLabel6.setText("Enter the Tool Name to return");}
    }
    
    @Override
    public void searchTool(String tool)throws FileNotFoundException, IOException{
        rentalApp.searchTool(tool);      
    }
    
    @Override
    public void rentTool(String toolName, int customerId)throws FileNotFoundException, IOException {
        rentalApp.rentTool(toolName, customerId);
    }
    
    @Override
    public void returnTool(String toolName)throws FileNotFoundException, IOException {
        rentalApp.returnTool(toolName);
    }
    
    @Override
    public void showAllTools()throws FileNotFoundException, IOException {
        rentalApp.showAllTools();
    }
    
    @Override
    public void showRentedTools() throws FileNotFoundException, IOException {
        rentalApp.showRentedTools();
    }
    
    @Override
    public void showRentalHistory() throws FileNotFoundException, IOException {
        rentalApp.showRentalHistory();
    }
    
    @Override
    public void searchCustomer(String lname, String fname) throws FileNotFoundException, IOException{
        rentalApp.searchCustomer(lname, fname);
    }
    
}
    
    
    

