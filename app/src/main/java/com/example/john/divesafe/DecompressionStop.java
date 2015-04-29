package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

public class DecompressionStop {
	public int diveTime; //dive time requiring decompression
	public int stopTime; //minutes required at 15' stop
	
	public DecompressionStop (int diveTime, int stopTime) {
		this.diveTime = diveTime;
		this.stopTime = stopTime;
	}
	
	public int getDiveTime () {
		return this.diveTime;
	}
	
	public int getStopTime () {
		return this.stopTime;
	}
	
	public void setDiveTime (int diveTime) {
		this.diveTime = diveTime;
	}
	
	public void setStopTime (int stopTime) {
		this.stopTime = stopTime;
	}
}
