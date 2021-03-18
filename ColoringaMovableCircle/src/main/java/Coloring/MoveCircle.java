/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coloring;

/**
 *
 * @author ASUS S410UN
 */
import java.awt.*;
import javax.swing.*;

public class MoveCircle {
//-----------------------------------
// Set up a frame for the GUI.
//-----------------------------------

    public static void main(String[] args) {
        JFrame frame = new JFrame("MoveCircle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.getContentPane().add(new CirclePanel(400, 300));
        frame.pack();
        frame.setVisible(true);
        
        JButton button = new JButton("Click Color");
        button.setBounds(50,100,95,30);
        button.addActionListener(new ActionListener()){
        public void 
    }
        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
}
