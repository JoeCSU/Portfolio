/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign3.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public class LargeBathRoom extends HomeComponent {
    MyHome myHome;
    
    public LargeBathRoom(MyHome myHome) {
        this.myHome = myHome;
    }
    
    public String getDescription() {
        return myHome.getDescription() + ", Large Bathroom";
    }   

    public double cost() {
        return 5000.00 + myHome.cost();
    }
    
    public double area() {
        return 120.00 + myHome.area();
    }
}
