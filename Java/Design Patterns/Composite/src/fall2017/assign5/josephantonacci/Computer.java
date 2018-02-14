/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign5.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public class Computer {
    
    CompComponent wholeComputer;
    
    public Computer(CompComponent wholeComputer) {
        this.wholeComputer = wholeComputer;
    }
    
    public void print() {
        wholeComputer.print();
    }
}
