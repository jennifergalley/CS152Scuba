package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
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
