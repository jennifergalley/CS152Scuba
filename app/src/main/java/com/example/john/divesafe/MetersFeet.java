package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

public class MetersFeet {
	private int meters;
	private int feet;
	
	public MetersFeet () {}
	
	public MetersFeet (int m, int f) {
		this.meters = m;
		this.feet = f;
	}
	
	public int getMeters () {
		return this.meters;
	}
	
	public int getFeet () {
		return this.feet;
	}
	
	public void setMeters (int m) {
		this.meters = m;
	}
	
	public void setFeet (int f) {
		this.feet = f;
	}
	
	public double metersToFeet (int meters) {
		return ((double) meters) * 3.28084;
	}

	public double feetToMeters (int feet) {
		return ((double) feet) / 3.28084;
	}
	
}
