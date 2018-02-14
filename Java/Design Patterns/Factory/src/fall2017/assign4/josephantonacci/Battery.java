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
public abstract class Battery {
    String car;
    String cells;
    String casing;
    String controller;
    String charger;
    
    void preparing() {
        System.out.println("Preparing a " + car + "Battery" + "\n");
    }
    
    void assembling() {
        System.out.println("Assembling the " + cells + " cells,"  + "\n               " + casing + " casing," + "\n               "  + controller + " controller," + "\n               " + charger + " charger");
    }
    
    void testing() {
        System.out.println("testing... success!");
    }
    
    void shipping() {
        System.out.println("Shipping the battery!!" + "\n");
    }
    
}
