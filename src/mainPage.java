/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hummingbee.sprinkler.system;

import static hummingbee.sprinkler.system.HomeOwnerConsole.HomeOwnerConsoleFrame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Vigneshwaran_Venugopal
 */
public class mainPage extends JFrame {
    JFrame mainPageFrame = new JFrame("Welcom to HummingBee Sprinkler System");
    JPanel mainPagePanel;
    JLabel mainPageBGLabel;
        JLabel BGLabel;

    public mainPage(){
         /*Frame*/
        mainPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make sure the program exits when the frame closes
        mainPageFrame.setTitle("** Welcome to HumminBee Sprinkler System **"); //Frame title
        mainPageFrame.setLocationRelativeTo(null);  //This will center the JFrame in the middle of the screen
        mainPageFrame.setPreferredSize(new Dimension(520,600)); // Dimension of the window
        
        mainPagePanel = new JPanel();
        mainPageBGLabel = new JLabel(new ImageIcon("s.png"));
        BGLabel = new JLabel("hi");
       
      add(mainPageBGLabel);
      mainPageBGLabel.add(BGLabel);
      
        mainPagePanel.add(mainPageBGLabel);
        /*Create and set up the content pane*/
        Container contentPane = mainPageFrame.getContentPane();  
        contentPane.add(mainPagePanel); 
        
         /*Display the window*/        
        mainPageFrame.pack();
        mainPageFrame.setVisible(true);
    }
        
        
    
}
