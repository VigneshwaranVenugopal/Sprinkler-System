/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hummingbee.sprinkler.system;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Vigneshwaran_Venugopal
 */
public class EnableSprinkler extends Sprinkler {
    
    HomeOwnerConsole  field;
    protected String inputSprinklerId; // Stores user Sprinkler Id input
    protected int arrayFieldNumber;  // to retreive the targeted field   
        ImageIcon cold= new ImageIcon(getClass().getResource("cold.png"));	

        
    public EnableSprinkler(){
        //Store the Id input from the user
       inputSprinklerId = field.sprinklerIdField.getText();
       System.out.println(inputSprinklerId );
        for ( int i=0; i<sprinklersList.size(); i++){
            if (inputSprinklerId.equals(sprinklersList.get(i).sprinklerId))  // to retreive corresponding field.
                arrayFieldNumber = i;         
        }
        
        
     if (sprinklersList.get(arrayFieldNumber).temperature <55){
       field.confirmationInfoLabel.setText("Temperatur below 55, Can't enable the sprinkler");
     field.confirmationInfoLabel.setIcon(cold);
     }
     else
     {  //Update the sprinkler info
         field.confirmationInfoLabel.setText("Sprinkler enabled at specified time");
         sprinklersList.get(arrayFieldNumber).day = field.dayField.getText();
         sprinklersList.get(arrayFieldNumber).startTime = field.startTimeField.getText();
         sprinklersList.get(arrayFieldNumber).endTime = field.endTimeField.getText();
         sprinklersList.get(arrayFieldNumber).functional = "Functional";


         
         
         
     }
            
    
    }           
}
