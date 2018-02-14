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

public class Vehicle extends Observable{
    private boolean needsRepair;
    private String repairTypeNeeded;
    
    public Vehicle() {}
    
    public void stateChanged() {
        setChanged();
        notifyObservers(this);
    }
    
    public void setRepairState(boolean needsRepair, String repairTypeNeeded) {
        this.needsRepair = needsRepair;
        this.repairTypeNeeded = repairTypeNeeded;
        stateChanged();
    }
    
    public boolean getNeedsRepair() {
        return needsRepair;
    }
    
    public String getRepairTypeNeeded() {
        return repairTypeNeeded; 
    }
}