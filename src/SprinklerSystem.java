/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hummingbee.sprinkler.system;

import java.sql.Time;

/**
 * This class contains the main components of the files
 * @author Vigneshwaran_Venugopal
 */
public class SprinklerSystem {
    protected String sprinklerId;
    protected String day;
    protected String startTime;
    protected String endTime;
    protected String functional;   //Two choice (Functional , not fuctional)
    protected int waterFlow;
    protected int temperature;
    
    /**
     * default constructor
     */
    public SprinklerSystem(){
        
    }
    
  /**
   * This constructor assigns values to data members
   * @param sprinklerId
   * @param day
   * @param startTime
   * @param endTime
   * @param functional
   * @param enabled
   * @param waterFlow
   *  @param temperature 
   */
    public SprinklerSystem(String sprinklerId,String day,String startTime,String endTime,String functional,int waterFlow, int temperature){
    this.sprinklerId = sprinklerId;
    this.day = day;
    this.startTime = startTime;
    this.endTime = endTime;
    this.functional = functional;
    this.waterFlow = waterFlow;
    this.temperature = temperature;
        
    }
}
