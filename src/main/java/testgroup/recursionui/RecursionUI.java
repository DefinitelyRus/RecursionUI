/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgroup.recursionui;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author definitelyrus
 */
public class RecursionUI {
    
    public static void main(String[] args) {
        RecursionGUI ui = new RecursionGUI();
        JFrame frame = new JFrame("The Recursionator 3000");
            
        //Sets to System UI look & feel.
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {}
        
        //Gets the screen size.
        int screenWidth = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getScreenDevices()[0].getConfigurations()[0].getBounds().width;
        int screenHeight = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getScreenDevices()[0].getConfigurations()[0].getBounds().height;
        
        //Sets the frame's starting location to the middle of the screen.
        //Malfunctions if using multiple displays.
        frame.setLocation(
                (screenWidth / 2) - (ui.mainPanel.getPreferredSize().width / 2),
                (screenHeight / 2) - (ui.mainPanel.getPreferredSize().height / 2)
        );
        
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(ui);
        frame.pack();
        frame.setVisible(true);
        ui.setVisible(true);
    }
}
