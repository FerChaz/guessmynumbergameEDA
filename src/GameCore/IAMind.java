/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameCore;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class IAMind {
    private int numberToGuess;
    
    public IAMind(){
        
    }
    public IAMind(int topLimit, int bottomLimit){
        this.numberToGuess = (int) (Math.random() * ((topLimit - bottomLimit) + 1)) + bottomLimit;
    }
    
    public void automaticGuessing(int topLimit, int bottomLimit, int numberToGuess) {
        int guess = (int) (Math.random() * ((topLimit - bottomLimit) + 1)) + bottomLimit;
        JOptionPane.showMessageDialog(null, "¿ Podrá ser " + guess + " ?");
        
        if (guess < numberToGuess) {
            JOptionPane.showMessageDialog(null, "Mmm.. es mayor que eso..");
            automaticGuessing(topLimit, guess + 1, numberToGuess);
        } else if (guess > numberToGuess) {
            JOptionPane.showMessageDialog(null, "Mmm.. es menor que eso..");
            automaticGuessing(guess - 1, bottomLimit, numberToGuess);
        } else {
            JOptionPane.showMessageDialog(null, "¡Lo conseguí! Es " + guess);
        }
    }
}
