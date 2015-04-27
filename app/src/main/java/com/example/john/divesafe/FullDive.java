package com.example.john.divesafe;

/**
 * Created by Jennifer on 4/15/2015.
 */
public class FullDive {
    private int id;
    // private String name;
    // private boolean feet; //true if in feet, false if in meters
    // private boolean naui; //true if naui table, false if padi
    private String name;
    private int dives[];
    private int SIT[];
    private String endingPG;
    private String metric;
    private SingleDive listOfSingleDives[];

    public String getName () { return name; }

    public void setName (String n) { name = n; }

    public long getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public int[] getDives() {
        return dives;
    }

    public void setDives(int[] d) {
        dives = d;
    }

    public int[] getSIT() {
        return SIT;
    }

    public void setSIT(int[] sit) {
        SIT = sit;
    }

    public void setListOfSingleDives(SingleDive[] d) {
        listOfSingleDives = d;
    }

    public SingleDive[] getListOfSingleDives() { return listOfSingleDives; }

    public void setEndingPG (String PG) {
        endingPG = PG;
    }

    public String getEndingPG () {
        return endingPG;
    }

    public void setMetric (String met) { metric = met; }

    public String getMetric () { return metric; }

    @Override
    public String toString() {
//        String toPrint = "Dive: " + name + "\n";
//        String toPrint = "All measurements in: " + metric + "\n";
        for (int i = 0; i < listOfSingleDives.length; i++) {
            if (listOfSingleDives[i] != null)
                listOfSingleDives[i].setMetric (metric);
            else
                break;
        }
        String toPrint = "";
        for (int i = 0; i < listOfSingleDives.length; i++) {
            if (listOfSingleDives[i] != null) {
                toPrint += listOfSingleDives[i].toString();
                if (i < listOfSingleDives.length - 1) {
                    toPrint += "\n\nSurface Interval Time: " + SIT[i] + " Minutes\n\n";
                }
            }
        }
        toPrint += "Ending Pressure Group: " + endingPG;
        return toPrint;
    }
}
