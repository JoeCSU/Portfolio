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
public class LargeLivingRoom extends HomeComponent {
    MyHome myHome;
    
    public LargeLivingRoom(MyHome myHome) {
        this.myHome = myHome;
    }
    
    public String getDescription() {
        return myHome.getDescription() + ", Large LivingRoom";
    }   

    public double cost() {
        return 9000.00 + myHome.cost();
    }
    
    public double area() {
        return 300.00 + myHome.area();
    }
}
