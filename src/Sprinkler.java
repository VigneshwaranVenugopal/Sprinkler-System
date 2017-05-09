/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hummingbee.sprinkler.system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextField;

/**
 *This class contains the information (ID,start time, end time, and water flow)about each sprinkler 
 * @author Vigneshwaran_Venugopal
 */
public class Sprinkler extends SprinklerSystem{
    
    /*Data members*/
    
    private Scanner scanner = null; // to read the file
    protected static ArrayList<SprinklerSystem> sprinklersList = new ArrayList<>(); // list to store the questions
    private static SprinklerSystem sprinklerField; // To store each sprinkler line

    /**
     * Default Constructor
     */
    public Sprinkler(){
 
    }
    
     /**
     * This method shows the sprinkler list
     * @return list of questions
     */
    public ArrayList<SprinklerSystem> showQuestions(){
        return sprinklersList;
    
    }
    
    /**
     * This method loads all sprinklers from the file to array list
     * @throws IOException 
     */
    public void loadQuestions () throws IOException
    {
        
        try{
            scanner = new Scanner (new BufferedReader(new FileReader("sprinkler.txt")));  //Read the file
            scanner.useDelimiter("[\\n,]+"); // scanner is to break down the input into tokens using a ":" delimiter. 
             
           while (scanner.hasNext()){ //read the whole file
           /* get the data from the file*/
            sprinklerId = scanner.next(); //Get the ID
            day = scanner.next(); // get the day
            startTime = scanner.next()+":";  //get the start time
            endTime = scanner.next()+":";   //get the end time
            functional =(scanner.next());   // Functional or not functional
            waterFlow = Integer.parseInt(scanner.next()); // get the water flow for this sprinkler
            temperature = Integer.parseInt(scanner.next());
            
            /*Create a question Filed*/
            sprinklerField = new SprinklerSystem (sprinklerId,day,startTime,endTime,functional,waterFlow,temperature);
            
            /*Add the sprinkler field to the sprinklersList arraylist*/
            sprinklersList.add(sprinklerField); 
           }
    }   /* Catch error if smth wrong with the file*/        
        catch(FileNotFoundException | NumberFormatException e)
        {
           System.out.println("File not found");

        }
                finally {
                    if (scanner != null) // if the file has been read
                    {
                        scanner.close();    //Close the file

                    }
                        }
        
  
    }
  

  
        
      
    
    
    
}
