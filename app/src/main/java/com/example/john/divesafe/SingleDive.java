package com.example.john.divesafe;

/**
 * Created by Jennifer on 4/14/2015.
 */
public class SingleDive {

    private int id;
    // private String name;
    // private boolean feet; //true if in feet, false if in meters
    // private boolean naui; //true if naui table, false if padi
    private int depth;
    private int bottomTime;
    private String pressGroup;
    private int decompTime; //depth always 15 feet, for both tables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int d) {
        this.depth = d;
    }

    public int getBottomTime() {
        return this.bottomTime;
    }

    public void setBottomTime(int time) {
        this.bottomTime = time;
    }

    public String getPressGroup() {
        return this.pressGroup;
    }

    public void setPressGroup(String grp) {
        this.pressGroup = grp;
    }

    public int getDecompTime() {
        return this.decompTime;
    }

    public void setDecompTime(int time) {
        this.decompTime = time;
    }

    @Override
    public String toString() {
        return "Depth: " + this.depth + "\n" +
                "Bottom Time: " + this.bottomTime  + "\n" +
                "Pressure Group: " + this.pressGroup  + "\n" +
                "Decompression Time: " + this.decompTime;
    }
}
