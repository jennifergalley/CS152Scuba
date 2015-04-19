package com.simrankaur.divesafe;

/**
 * Created by simrankaur on 4/13/15.
 */

//PADI Table 3 Repetitive Dive TimeTable
public class RNTABT {
    private int RNT; //residual nitrogen time
    private int ABT; //actual bottom times

    public RNTABT (int RNT, int ABT) {
        this.RNT = RNT;
        this.ABT = ABT;
    }

    public int getRNT () {
        return this.RNT;
    }

    public int getABT () {
        return this.ABT;
    }

    public void setRNT (int RNT) {
        this.RNT = RNT;
    }

    public void setABT (int ABT) {
        this.ABT = ABT;
    }
}
