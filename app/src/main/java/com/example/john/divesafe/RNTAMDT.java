package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
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
