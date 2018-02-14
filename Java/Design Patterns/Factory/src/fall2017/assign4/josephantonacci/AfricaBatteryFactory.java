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
public class AfricaBatteryFactory extends BatteryFactory {
    
    public Battery createBattery(String car) {
        if (car.equals("Civic")) {
            return new AfricaCivicBattery();}
        else if (car.equals("Accord")) {
            return new AfricaAccordBattery();}
        else if (car.equals("CRV")) {
            return new AfricaCRVBattery();}
        else if (car.equals("Odyssey")) {
            return new AfricaOdysseyBattery();}
        else return null;
    }
}
