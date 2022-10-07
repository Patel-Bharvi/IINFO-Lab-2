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

    static void remove(UIDATA ud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private ArrayList<UIDATA> history;

    public History() {

        this.history = new ArrayList<UIDATA>();

    }

    public ArrayList<UIDATA> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<UIDATA> history) {
        this.history = history;
    }

    public UIDATA addnewrecords() {

        UIDATA newRecords = new UIDATA();
        history.add(newRecords);
        return newRecords;

    }

    public void deleteUI(UIDATA selectedUI) {
        history.remove(selectedUI);
    }
}
