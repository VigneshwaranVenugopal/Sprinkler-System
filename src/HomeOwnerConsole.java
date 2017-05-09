package hummingbee.sprinkler.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Vigneshwaran_Venugopal
 */
public class HomeOwnerConsole extends JFrame {
    /*Data members*/
    /*Main frame*/
     protected static JFrame HomeOwnerConsoleFrame = new JFrame(); 
     /*Display Screen*/
     Sprinkler displayScreen ; //display panel should display the sprinkler ID, daily schedule,and the water flow.
     protected static JPanel displayScreenPanel = new JPanel();
     /*Control Panel*/
     JButton enableButton;
     JButton disableButton;
     JButton configureButton;
     JButton viewSprinklerStatusButton;
     JButton barGraphButton;
     JPanel controlPanel = new JPanel();
     
      /*labels*/
    JLabel sprinklerIdLabel;
    JLabel dayLabel;
    JLabel startTimeLabel;
    JLabel endTimeLabel;
    JLabel waterFlowLabel;
    JLabel confirmationLabel;
    JLabel confirmationInfoLabel = new JLabel();

    /*textField for each label*/
    JTextField sprinklerIdField;
    JTextField dayField;
    JTextField startTimeField;
    JTextField endTimeField;
    JTextField waterFlowField;
    
    
    
/**
     * Constructor creates the main frame
     */   
    public  HomeOwnerConsole(){
        /*Frame*/
        HomeOwnerConsoleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make sure the program exits when the frame closes
        HomeOwnerConsoleFrame.setTitle("** Welcome to HumminBee Sprinkler System **"); //Frame title
        HomeOwnerConsoleFrame.setLocationRelativeTo(null);  //This will center the JFrame in the middle of the screen
        HomeOwnerConsoleFrame.setPreferredSize(new Dimension(520,600)); // Dimension of the window
        
        /*Display Screen*/
        displayScreenPanel.setBorder(new TitledBorder( BorderFactory.createLineBorder(Color.white, 2, rootPaneCheckingEnabled),"Display screen",0,0,new Font("Times", Font.PLAIN, 15),Color.BLUE));
     
  /*Sprinkler Id */
    sprinklerIdLabel = new JLabel("Sprinkle ID: ");
    labelSetting(sprinklerIdLabel); //to change the color and font
    sprinklerIdField = new JTextField("Sprinkler ID");
    
    /*Day*/
    dayLabel = new JLabel("Day: ");
    labelSetting(dayLabel);
    dayField = new JTextField("day");

    /*Start time*/
    startTimeLabel = new JLabel("Start time: ");
    labelSetting(startTimeLabel);
    startTimeField = new JTextField("start time");

    /*End time*/
    endTimeLabel = new JLabel("End time: ");
    labelSetting(endTimeLabel);
    endTimeField = new JTextField("end time");

    /*watre flow*/
    waterFlowLabel = new JLabel("Water Flow: ");
    labelSetting(waterFlowLabel);
    waterFlowField = new JTextField("waterFlow");
    
    confirmationLabel = new JLabel ("Confirmation");
    labelSetting(confirmationLabel);
    
    
        displayScreenPanel.setLayout(new GridLayout(7,0));
        displayScreenPanel.add(sprinklerIdLabel);
        displayScreenPanel.add(sprinklerIdField);
        displayScreenPanel.add(dayLabel);
        displayScreenPanel.add(dayField);
        displayScreenPanel.add(startTimeLabel);
        displayScreenPanel.add(startTimeField);
        displayScreenPanel.add(endTimeLabel);
        displayScreenPanel.add(endTimeField);
        displayScreenPanel.add(waterFlowLabel);
        displayScreenPanel.add(waterFlowField);
        displayScreenPanel.add(confirmationLabel);

        /*Control Panel*/
        /*Enable Button*/
      enableButton = new JButton("         Enable system        ");
      enableButton.setActionCommand("enable");
      enableButton.setBackground(Color.getHSBColor(255, 150, 250));
      buttonSetting(enableButton);
      enableButton.addActionListener( new ActionListener()
      { 
                        @Override
			public void actionPerformed(ActionEvent evt) {                            
                EnableSprinkler enable = new EnableSprinkler();
                        }
		});
      //Disable button
      disableButton = new JButton("       Disable system          ");
      disableButton.setActionCommand("disable");
      disableButton.setBackground(Color.getHSBColor(230, 193, 28));
      buttonSetting(disableButton);
      disableButton.addActionListener( new ActionListener()
      { 
                        @Override
			public void actionPerformed(ActionEvent evt) {                            
                          //do smth
                        }
		});
      
      /*Configure Button*/
      configureButton = new JButton("      Configure system      ");
      configureButton.setActionCommand("enable");
      configureButton.setBackground(Color.getHSBColor(250, 240, 120));
       buttonSetting(configureButton);
      configureButton.addActionListener( new ActionListener()
      { 
                        @Override
			public void actionPerformed(ActionEvent evt) {                            
                          //do smth
                        }
		});
      
      /*View Button*/
      viewSprinklerStatusButton = new JButton("   View sprinkler status   ");
      viewSprinklerStatusButton.setActionCommand("enable");
      viewSprinklerStatusButton.setBackground(Color.getHSBColor(255, 230, 170));
      buttonSetting(viewSprinklerStatusButton);
      viewSprinklerStatusButton.addActionListener( new ActionListener()
      { 
                        @Override
			public void actionPerformed(ActionEvent evt) {                            
                          //do smth
                        }
		});
      
       /*Bar Graph Button*/
      barGraphButton = new JButton("       Show bar graph       ");
      barGraphButton.setActionCommand("bar");
      barGraphButton.setBackground(Color.getHSBColor(250, 240, 160));
      buttonSetting(barGraphButton);
      barGraphButton.addActionListener( new ActionListener()
      { 
                        @Override
			public void actionPerformed(ActionEvent evt) {                            
                          //do smth
                        }
		});
      
      
      /*Buttons layout*/
      controlPanel.setBorder(new TitledBorder( BorderFactory.createLineBorder(Color.white, 2, rootPaneCheckingEnabled),"Control Panel",0,0,new Font("Times", Font.PLAIN, 15),Color.BLUE));
      controlPanel.setBackground(Color.LIGHT_GRAY);
      controlPanel.add(Box.createRigidArea(new Dimension(25,80)));
      controlPanel.add(enableButton);
      controlPanel.add(Box.createRigidArea(new Dimension(25,80)));
      controlPanel.add(disableButton);
      controlPanel.add(Box.createRigidArea(new Dimension(25,80)));
      controlPanel.add(configureButton);
      controlPanel.add(Box.createRigidArea(new Dimension(25,80)));
      controlPanel.add(viewSprinklerStatusButton);
      controlPanel.add(Box.createRigidArea(new Dimension(25,80)));
      controlPanel.add(barGraphButton);

        /*Create and set up the content pane*/
        Container contentPane = HomeOwnerConsoleFrame.getContentPane();
       	contentPane.setLayout( new GridLayout( 2, 1 ) );   
        contentPane.add(displayScreenPanel); 
        contentPane.add(controlPanel);  
        
        
        /*Display the window*/        
        HomeOwnerConsoleFrame.pack();
        HomeOwnerConsoleFrame.setVisible(true);
    }
  
     
     /**
      * This method creates setting for buttons
      * @param button 
      */
     public static void buttonSetting(JButton button){
      button.setForeground(Color.WHITE);
      button.setMargin(new Insets(30,30,30,30));
      button.setOpaque(true);
      button.setSize(new Dimension(150, 70));
      button.setBorder(BorderFactory.createRaisedBevelBorder());
      button.setFont(new Font("Times", Font.PLAIN, 20));
      button.setCursor(new Cursor(Cursor.HAND_CURSOR));
      button.setVisible(true);
         
     }
/**
     * this method to format JLabels
     * @param label 
     */
    public static void labelSetting(JLabel label){
        label.setFont(new Font("Times",0,15)); 
        label.setForeground(Color.getHSBColor(155, 150, 55)); 
        label.setVisible(true);
    }
}
