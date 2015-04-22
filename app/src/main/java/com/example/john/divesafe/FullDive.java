package com.example.john.divesafe;

/**
 * Created by Jennifer on 4/15/2015.
 */
public class FullDive {
    private int id;
    // private String name;
    // private boolean feet; //true if in feet, false if in meters
    // private boolean naui; //true if naui table, false if padi
    private int dives[];
    private int SIT[];
    private SingleDive listOfSingleDives[];

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getDives() {
        return this.dives;
    }

    public void setDives(int[] d) {
        this.dives = d;
    }

    public int[] getSIT() {
        return this.SIT;
    }

    public void setSIT(int[] sit) {
        this.SIT = sit;
    }

    public void setListOfSingleDives(SingleDive[] d) { this.listOfSingleDives = d; }

    public SingleDive[] getListOfSingleDives() { return this.listOfSingleDives; }

    @Override
    public String toString() {
        String toPrint = "";
        for (int i = 0; i < listOfSingleDives.length; i++) {
            if (listOfSingleDives[i] != null) {
                toPrint += listOfSingleDives[i].toString();
                if (i < listOfSingleDives.length - 1) {
                    toPrint += "\nSurface Interval Time: " + SIT[i] + "\n";
                }
            }
        }
        return toPrint;
    }
}
