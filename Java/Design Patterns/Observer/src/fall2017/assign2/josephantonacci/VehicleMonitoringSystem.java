/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign2.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public class VehicleMonitoringSystem {

    //demonstrates poeration of type1 and type2 monitors for 1 vehicle as well as type3 for up to 3 vehicles
    
    public static void main(String[] args) {
                
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        Vehicle vehicle4 = new Vehicle();
        
        Type1Monitor monitor1 = new Type1Monitor(vehicle1);
        
        vehicle1.addObserver(monitor1);       
        vehicle1.setRepairState(true, "Minor_Repair");
        vehicle1.setRepairState(true, "Major_Repair");
        vehicle1.setRepairState(false, "Major_Repair");
        vehicle1.deleteObserver(monitor1);
        System.out.println();
        
        Type2Monitor monitor2 = new Type2Monitor(vehicle1);
        
        vehicle1.addObserver(monitor2);       
        vehicle1.setRepairState(true, "Minor_Repair");
        vehicle1.setRepairState(true, "Major_Repair");
        vehicle1.setRepairState(false, "Major_Repair");
        vehicle1.deleteObserver(monitor2);            
        vehicle2.addObserver(monitor2);
        vehicle2.setRepairState(true, "Minor_Repair");
        System.out.println();

        
        
        Type3Monitor monitor3 = new Type3Monitor(vehicle1);
        
        vehicle1.setRepairState(true, "Minor_Repair");
        vehicle1.setRepairState(true, "Major_Repair");
        vehicle2.addObserver(monitor3);
        vehicle2.setRepairState(false, "Major_Repair");
        vehicle3.addObserver(monitor3);
        vehicle3.setRepairState(false, "Major_Repair");
        vehicle4.addObserver(monitor3); 
        vehicle4.setRepairState(false, "Major_Repair");
        
    }    
        
}