package com.example.john.divesafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class PADIDiveTableTest {

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnL() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(80, 22);
		assertTrue(letter == 'L');
	}

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnA() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(35, 5);
		assertTrue(letter == 'A');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnZ() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(40, 140);
		assertTrue(letter == 'Z');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnL() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(16, 37);
		assertTrue(letter == 'L');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnA() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(30, 3);
		assertTrue(letter == 'A');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnZ() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(12, 147);
		assertTrue(letter == 'Z');
	}

	@Test
	public void testGetLetterNumberShouldReturn0() {
		PADIDiveTable table = new PADIDiveTable();
		int number = table.getLetterNumber('A');
		assertTrue(number == 0);
	}

	@Test
	public void testGetLetterNumberShouldReturn6() {
		PADIDiveTable table = new PADIDiveTable();
		int number = table.getLetterNumber('G');
		assertTrue(number == 6);
	}

	@Test
	public void testGetLetterNumberShouldReturn25() {
		PADIDiveTable table = new PADIDiveTable();
		int number = table.getLetterNumber('Z');
		assertTrue(number == 25);
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnA() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('A', 120);
		assertTrue(letter == 'A');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnK() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('O', 20);
		assertTrue(letter == 'K');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnZ() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('Z', 1);
		assertTrue(letter == 'Z');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturn2ExtendedHours() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('Z', 1440);
		assertTrue(letter == '2');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturn1OutOfRangeDepth() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('Z', 35, 10);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturnT() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('N', 70, 10);
		assertTrue(letter == 'T');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturn1OutOfRangeMinutes() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('A', 130, 15);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturn1OutOfRangeDepth2() {
		PADIDiveTable table = new PADIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('Z', 100, 10);
		assertTrue(letter == '1');
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnFalse() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(50, 30);
		assertFalse(required);
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnTrue() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(70, 34);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnTrueLargeDepth() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(110, 10);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnTrueLargeMinutes() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(90, 25);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnTrueOutOfRangeMinutes() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(70, 60);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredFeetShouldReturnTrueOutOfRangeDepth() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredFeet(160, 30);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnFalse() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(16, 30);
		assertFalse(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnTrue() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(14, 78);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnTrueLargeDepth() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(35, 10);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnTrueLargeMinutes() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(17, 56);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnTrueOutOfRangeMinutes() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(20, 60);
		assertTrue(required);
	}

	@Test
	public void testSafetyStopRequiredMetersShouldReturnTrueOutOfRangeDepth() {
		PADIDiveTable table = new PADIDiveTable();
		boolean required = table.safetyStopRequiredMeters(50, 10);
		assertTrue(required);
	}

	@Test
	public void testGetIndexDepthFeetShouldReturn2() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthFeet(50);
		assertTrue(index == 2);
	}

	@Test
	public void testGetIndexDepthFeetShouldReturn0() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthFeet(34);
		assertTrue(index == 0);
	}

	@Test
	public void testGetIndexDepthFeetShouldReturn11() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthFeet(140);
		assertTrue(index == 11);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn2() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthMeters(14);
		assertTrue(index == 2);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn0() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthMeters(5);
		assertTrue(index == 0);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn11() {
		PADIDiveTable table = new PADIDiveTable();
		int index = table.getIndexDepthMeters(42);
		assertTrue(index == 11);
	}
	
	@Test
	public void testSafeDiveElevationFeetShouldReturnTrue() {
		PADIDiveTable table = new PADIDiveTable();
		boolean safe = table.safeDiveElevationFeet(500);
		assertTrue(safe);
	}
	
	@Test
	public void testSafeDiveElevationFeetShouldReturnFalse() {
		PADIDiveTable table = new PADIDiveTable();
		boolean safe = table.safeDiveElevationFeet(1500);
		assertFalse(safe);
	}
	
	@Test
	public void testSafeDiveElevationMetersShouldReturnTrue() {
		PADIDiveTable table = new PADIDiveTable();
		boolean safe = table.safeDiveElevationMeters(150);
		assertTrue(safe);
	}
	
	@Test
	public void testSafeDiveElevationMetersShouldReturnFalse() {
		PADIDiveTable table = new PADIDiveTable();
		boolean safe = table.safeDiveElevationMeters(500);
		assertFalse(safe);
	}
	
	@Test
	public void testFlyingTimeShouldReturn12() {
		PADIDiveTable table = new PADIDiveTable();
		int hours = table.flyingTime(100);
		assertTrue(hours == 12);
	}
	
	@Test
	public void testFlyingTimeShouldReturn24() {
		PADIDiveTable table = new PADIDiveTable();
		int hours = table.flyingTime(150);
		assertTrue(hours == 24);
	}
}
