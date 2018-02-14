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
public class Fall2017Assign5JosephAntonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompComponent CPU = new SinglePart("Intel i5 CPU", 400.00);
        CompComponent GPU = new SinglePart("Intel GPU", 300.00);
        CompComponent memory = new SinglePart("Corsair Memory", 80.00);
        CompComponent graphicsMemory = new SinglePart("Graphics Memory 3GB", 50.00);
        CompComponent monitor = new SinglePart("Asus Monitor", 140.00);
        CompComponent keyboard = new SinglePart("Keyboard", 20.00);
        CompComponent graphicsCard = new CompositePart("nVidia GE Force", 350.00);
        CompComponent wholeComputer = new CompositePart("Asus Desktop PC", 1290.00);

        wholeComputer.add(CPU);
        wholeComputer.add(memory);
        wholeComputer.add(keyboard);
        wholeComputer.add(monitor);
        wholeComputer.add(graphicsCard);
        
        graphicsCard.add(GPU);
        graphicsCard.add(graphicsMemory);
        
        Computer computer = new Computer(wholeComputer);
                
        computer.print();
 
    }
}
