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
public abstract class BatteryFactory {
    
    
    public Battery orderBattery(String car) {
        
        Battery battery;
        
        battery = createBattery(car);
        battery.preparing();
        battery.assembling();
        battery.testing();
        battery.shipping();
        
        return battery;
    }
    
    protected abstract Battery createBattery(String car);
}
