package com.example.john.divesafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class SurfaceIntervalRangeTest {

	/*@Test
	public void testSurfaceIntervalRange() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGetMin() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange(12, 37);
		int min = sir.getMin();
		assertTrue (min == 12);
	}

	@Test
	public void testGetMax() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange(12, 37);
		int max = sir.getMax();
		assertTrue (max == 37);
	}

	@Test
	public void testSetMin() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		sir.setMin(12);
		int min = sir.getMin ();
		assertTrue (min == 12);
	}

	@Test
	public void testSetMax() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		sir.setMax(37);
		int max = sir.getMax ();
		assertTrue (max == 37);
	}

	@Test
	public void testMinutesToHoursShouldReturn2() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		double hours = sir.minutesToHours(120);
		assertTrue (hours == 2.0);
	}

	@Test
	public void testMinutesToHoursShouldReturn3() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		double hours = sir.minutesToHours(222);
		assertTrue (hours == 3.7);
	}

	@Test
	public void testHoursToMinutesShouldReturn120() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		double minutes = sir.hoursToMinutes(2);
		assertTrue (minutes == 120);
	}

	@Test
	public void testHoursToMinutesShouldReturn60() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		double minutes = sir.hoursToMinutes(1.3);
		assertTrue (minutes == 78);
	}

	@Test
	public void testPrettyPrintShouldReturn207() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		String s = sir.prettyPrint(127);
		assertTrue (s.equals("2:07"));
	}

	@Test
	public void testPrettyPrintShouldReturn357() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		String s = sir.prettyPrint(237);
		assertTrue (s.equals("3:57"));
	}

	@Test
	public void testPrettyPrintShouldReturn10() {
		SurfaceIntervalRange sir = new SurfaceIntervalRange();
		String s = sir.prettyPrint(10);
		assertTrue (s.equals("0:10"));
	}

}
