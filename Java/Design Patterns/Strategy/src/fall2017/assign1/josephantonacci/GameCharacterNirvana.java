/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign1.josephantonacci;

/**
 *
 * @author Joe
 */
public class GameCharacterNirvana extends GameCharacter {
    
    public GameCharacterNirvana() {
        guitar = new FenderJaguar();
        soloMove = new DanceAndPlay();
    }
    
    @Override
    public void display() {
        System.out.println("We're Nirvana!");
    }
 
}
