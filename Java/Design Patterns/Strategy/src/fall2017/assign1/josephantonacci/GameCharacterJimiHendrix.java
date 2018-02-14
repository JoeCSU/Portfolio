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
public class GameCharacterJimiHendrix extends GameCharacter {
    
    public GameCharacterJimiHendrix() {
        guitar = new GibsonFlying();
        soloMove = new StopPlaying();
    }
    
    @Override
    public void display() {
        System.out.println("I'm Jimi Hendrix!");
    }
 
}
