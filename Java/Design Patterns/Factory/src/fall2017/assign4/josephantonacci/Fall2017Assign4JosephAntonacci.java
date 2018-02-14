/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign4.josephantonacci;

/**
 *
 * @author Joe
 */
public class Fall2017Assign4JosephAntonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BatteryFactory usaBattery = new USABatteryFactory();
        usaBattery.orderBattery("Civic");
        usaBattery.orderBattery("Accord");
        usaBattery.orderBattery("Odyssey");
        usaBattery.orderBattery("CRV");
        
        BatteryFactory euBattery = new EUBatteryFactory();
        euBattery.orderBattery("Civic");
        euBattery.orderBattery("Accord");
        euBattery.orderBattery("Odyssey");
        euBattery.orderBattery("CRV");

        BatteryFactory africaBattery = new AfricaBatteryFactory();
        africaBattery.orderBattery("Civic");
        africaBattery.orderBattery("Accord");
        africaBattery.orderBattery("Odyssey");
        africaBattery.orderBattery("CRV");

        BatteryFactory asiaBattery = new AsiaBatteryFactory();
        asiaBattery.orderBattery("Civic");
        asiaBattery.orderBattery("Accord");
        asiaBattery.orderBattery("Odyssey");
        asiaBattery.orderBattery("CRV");        
    }    
}
