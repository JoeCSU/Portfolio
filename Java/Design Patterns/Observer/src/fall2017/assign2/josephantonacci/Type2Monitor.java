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
import java.util.*;
import java.util.Observable;
import java.util.Observer;

public class Type2Monitor implements Observer, MonitorDisplay {
    Observable observable;
    private boolean needsRepair;
    private String repairTypeNeeded;
    
    public Type2Monitor(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
 public void update(Observable obs, Object arg) {
        if (obs instanceof Vehicle) 
            {
            Vehicle vehicle = (Vehicle)obs;
            this.needsRepair = vehicle.getNeedsRepair();
            this.repairTypeNeeded = vehicle.getRepairTypeNeeded();
            display();    
            }
        }
        
	public void display() {
            if(needsRepair)
            {
                System.out.println("The vehicle needs " + repairTypeNeeded);
            }
        else    
            {
                System.out.println("The vehicle does not need repair.");
            }
	}
}

