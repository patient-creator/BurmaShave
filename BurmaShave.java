/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burmashave;

/**
 *
 * @author 25027201
 */
import javax.swing.JOptionPane;
public class BurmaShave {

    public static void main(String[] args) {
        String[] Rhyme ={
            " Shaving brushes",
            " you'll soon see 'em ",
            " On a shelf ",
            " In some museum ",
            " Burma shave "
        };
        for(String line : Rhyme ){
            JOptionPane.showMessageDialog(null,line, ("Burma Shave"),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
