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
public interface RentalControllerInterface {

    public void setData();
     
    public void createCustomer(String name) throws IOException;
    
    public void showAllCustomers() throws FileNotFoundException, IOException;
    
    public void deleteCustomer(int id) throws IOException;
    
    public void searchCustomer(String lname, String fname) throws FileNotFoundException, IOException;
    
    public void searchTool(String tool)throws FileNotFoundException, IOException;
    
    public void rentTool(String toolName, int customerId)throws FileNotFoundException, IOException;
  
    public void returnTool(String name)throws FileNotFoundException, IOException;
    
    public void showAllTools()throws FileNotFoundException, IOException;
    
    public void showRentedTools() throws FileNotFoundException, IOException;
    
    public void showRentalHistory()throws FileNotFoundException, IOException;
    
    public void displayInputFields(int action);
    
    public void setMainView();
    
}
