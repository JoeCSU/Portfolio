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
import java.util.Observable;
import java.util.Observer;
import java.util.*;

public class Type3Monitor implements Observer, MonitorDisplay {
    Observable observable;
    private boolean needsRepair;
    private String repairTypeNeeded;
    private ArrayList<Object> monitors;

    public Type3Monitor(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        monitors = new ArrayList<Object>();
    }
    
    public void update(Observable obs, Object arg) {
        if (obs instanceof Vehicle && (monitors.size() < 3 || monitors.contains(arg))) 
        {
            if(!monitors.contains(arg)) 
            {
                monitors.add(arg);
            }  
            Vehicle vehicle = (Vehicle)obs;
            this.needsRepair = vehicle.getNeedsRepair();
            this.repairTypeNeeded = vehicle.getRepairTypeNeeded();
            display();    
	}
        else
            {
                System.out.println("Cannot add another vehicle");
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