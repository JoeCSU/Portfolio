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

public class SmallTermProjectMVC {

    public static void main(String[] args) throws IOException {
        
        RentalModel rentalApp = new RentalModel();
        RentalControllerInterface controller = new RentalController(rentalApp);
    }
}
