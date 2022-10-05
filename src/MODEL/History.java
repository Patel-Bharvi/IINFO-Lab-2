/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.ArrayList;

/**
 *
 * @author bharv
 */
public class History {
    
    private ArrayList <UIDATA> history;
    
    public History(){
        
        this.history = new ArrayList <UIDATA>();

    }

    public ArrayList<UIDATA> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<UIDATA> history) {
        this.history = history;
    }
    
    public UIDATA addnewrecords(){
        
      UIDATA newRecords = new UIDATA();
      history.add(newRecords);
      return newRecords;
        
    }
}
