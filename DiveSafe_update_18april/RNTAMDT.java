package com.simrankaur.divesafe;

/**
 * Created by simrankaur on 4/13/15.
 */
//NAUI Table 3 Repetitive Dive TimeTable
public class RNTAMDT {
    private int RNT; //residual nitrogen time
    private int AMDT; //adjusted maximum dive times

    public RNTAMDT (int RNT, int AMDT) {
        this.RNT = RNT;
        this.AMDT = AMDT;
    }

    public int getRNT () {
        return this.RNT;
    }

    public int getAMDT () {
        return this.AMDT;
    }

    public void setRNT (int RNT) {
        this.RNT = RNT;
    }

    public void setMax (int AMDT) {
        this.AMDT = AMDT;
    }
}
