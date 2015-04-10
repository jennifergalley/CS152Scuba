package com.example.john.divesafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class NAUIDiveTableTest {

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnG() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(80, 27);
		assertTrue(letter == 'G');
	}

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnB() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(100, 5);
		assertTrue(letter == 'B');
	}

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnL() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(90, 50);
		assertTrue(letter == 'L');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnBIntermediateMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(90, 4);
		assertTrue(letter == 'B');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnBIntermediateDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(55, 4);
		assertTrue(letter == 'B');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnKIntermediateMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(100, 30);
		assertTrue(letter == 'K');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnCIntermediateMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(120, 4);
		assertTrue(letter == 'C');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturn1OutOfRangeMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(120, 34);
		assertTrue(letter == '1');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturn1OutOfRangeDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(140, 14);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnG() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(24, 27);
		assertTrue(letter == 'G');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnB() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(30, 5);
		assertTrue(letter == 'B');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnL() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(27, 50);
		assertTrue(letter == 'L');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnBIntermediateMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(18, 5);
		assertTrue(letter == 'B');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnIIntermediateMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(36, 20);
		assertTrue(letter == 'I');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturn1OutOfRangeMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(40, 30);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturn1OutOfRangeDepthDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(45, 30);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterNumberShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int number = table.getLetterNumber('A');
		assertTrue(number == 0);
	}
	@Test
	public void testGetLetterNumberShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int number = table.getLetterNumber('4');
		assertTrue(number == -1);
	}

	@Test
	public void testGetLetterNumberShouldReturn6() {
		NAUIDiveTable table = new NAUIDiveTable();
		int number = table.getLetterNumber('G');
		assertTrue(number == 6);
	}

	@Test
	public void testGetLetterNumberShouldReturn11() {
		NAUIDiveTable table = new NAUIDiveTable();
		int number = table.getLetterNumber('L');
		assertTrue(number == 11);
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnA() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('A', 120);
		assertTrue(letter == 'A');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnH() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('J', 75);
		assertTrue(letter == 'H');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnK() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('L', 33);
		assertTrue(letter == 'K');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('L', 5);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturn1ExtendedHours() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('L', 1500);
		assertTrue(letter == '2');
	}
	
	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturnE() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('B', 40, 20);
		assertTrue(letter == 'E');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturnI() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('G', 70, 6);
		assertTrue(letter == 'I');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturn1OutOfRangeDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('L', 110, 1);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturn1OutOfRangeMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('D', 80, 20);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveFeetShouldReturnIIntermediateDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveFeet('G', 65, 5);
		assertTrue(letter == 'I');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveMetersShouldReturnE() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveMeters('B', 12, 20);
		assertTrue(letter == 'E');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveMetersShouldReturnI() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveMeters('G', 21, 6);
		assertTrue(letter == 'I');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveMetersShouldReturn1OutOfRangeDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveMeters('L', 33, 1);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveMetersShouldReturn1OutOfRangeMinutes() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveMeters('D', 24, 20);
		assertTrue(letter == '1');
	}

	@Test
	public void testGetLetterGroupRepetitiveDiveMetersShouldReturnIIntermediateDepth() {
		NAUIDiveTable table = new NAUIDiveTable();
		char letter = table.getLetterGroupRepetitiveDiveMeters('G', 20, 5);
		assertTrue(letter == 'I');
	}
	
	@Test
	public void testGetIndexDepthFeetShouldReturn6() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthFeet(95);
		assertTrue(index == 6);
	}
	
	@Test
	public void testGetIndexDepthFeetShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthFeet(35);
		assertTrue(index == 0);
	}
	
	@Test
	public void testGetIndexDepthFeetShouldReturn9() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthFeet(130);
		assertTrue(index == 9);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn6() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthMeters(29);
		assertTrue(index == 6);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthMeters(10);
		assertTrue(index == 0);
	}

	@Test
	public void testGetIndexDepthMetersShouldReturn9() {
		NAUIDiveTable table = new NAUIDiveTable();
		int index = table.getIndexDepthMeters(40);
		assertTrue(index == 9);
	}

	@Test
	public void testGetColFirstDiveTableShouldReturn4() {
		NAUIDiveTable table = new NAUIDiveTable();
		int col = table.getColFirstDiveTable(5, 14);
		assertTrue(col == 4);
	}

	@Test
	public void testGetColFirstDiveTableShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int col = table.getColFirstDiveTable(0, 5);
		assertTrue(col == 0);
	}

	@Test
	public void testGetColFirstDiveTableShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int col = table.getColFirstDiveTable(9, 30);
		assertTrue(col == -1);
	}

//	@Test
//	public void testGetTotalDiveTimeFeetShouldReturn1() {
//		NAUIDiveTable table = new NAUIDiveTable();
//		int totalTime = table.getTotalDiveTimeFeet('L', 50, 10);
//		assertTrue(totalTime == -1);
//	}

	@Test
	public void testGetTotalDiveTimeFeetShouldReturn107() {
		NAUIDiveTable table = new NAUIDiveTable();
		int totalTime = table.getTotalDiveTimeFeet('A', 30, 100);
		assertTrue(totalTime == 107);
	}

//	@Test
//	public void testGetTotalDiveTimeMetersShouldReturn1() {
//		NAUIDiveTable table = new NAUIDiveTable();
//		int totalTime = table.getTotalDiveTimeMeters('L', 15, 10);
//		assertTrue(totalTime == -1);
//	}

	@Test
	public void testGetTotalDiveTimeMetersShouldReturn107() {
		NAUIDiveTable table = new NAUIDiveTable();
		int totalTime = table.getTotalDiveTimeMeters('A', 10, 100);
		assertTrue(totalTime == 107);
	}
	
	@Test
	public void testSafeDiveElevationFeetShouldReturnTrue() {
		NAUIDiveTable table = new NAUIDiveTable();
		boolean safe = table.safeDiveElevationFeet(500);
		assertTrue(safe);
	}
	
	@Test
	public void testSafeDiveElevationFeetShouldReturnFalse() {
		NAUIDiveTable table = new NAUIDiveTable();
		boolean safe = table.safeDiveElevationFeet(1500);
		assertFalse(safe);
	}
	
	@Test
	public void testSafeDiveElevationMetersShouldReturnTrue() {
		NAUIDiveTable table = new NAUIDiveTable();
		boolean safe = table.safeDiveElevationMeters(150);
		assertTrue(safe);
	}
	
	@Test
	public void testSafeDiveElevationMetersShouldReturnFalse() {
		NAUIDiveTable table = new NAUIDiveTable();
		boolean safe = table.safeDiveElevationMeters(500);
		assertFalse(safe);
	}
	
	@Test
	public void testFlyingTimeShouldReturn12() {
		NAUIDiveTable table = new NAUIDiveTable();
		int hours = table.flyingTime(100);
		assertTrue(hours == 12);
	}
	
	@Test
	public void testFlyingTimeShouldReturn24() {
		NAUIDiveTable table = new NAUIDiveTable();
		int hours = table.flyingTime(150);
		assertTrue(hours == 24);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveFeetShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveFeet(80, 25);
		assertTrue(minutes == 0);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveFeetShouldReturn7() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveFeet(110, 30);
		assertTrue(minutes == 7);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveFeetShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveFeet(130, 30);
		assertTrue(minutes == -1);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveMetersShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveMeters(23, 25);
		assertTrue(minutes == 0);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveMetersShouldReturn7() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveMeters(33, 30);
		assertTrue(minutes == 7);
	}
	
	@Test
	public void testDecompressionStopMinutesFirstDiveMetersShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesFirstDiveMeters(37, 30);
		assertTrue(minutes == -1);
	}
	
	@Test
	public void testdecompressionStopMinutesRepetitiveDiveFeetShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesRepetitiveDiveFeet('A', 37, 30);
		assertTrue(minutes == 0);
	}
	
	@Test
	public void testdecompressionStopMinutesRepetitiveDiveFeetShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesRepetitiveDiveFeet('L', 60, 30);
		assertTrue(minutes == -1);
	}
	
//	@Test
//	public void testdecompressionStopMinutesRepetitiveDiveFeetShouldReturn15() {
//		NAUIDiveTable table = new NAUIDiveTable();
//		int minutes = table.decompressionStopMinutesRepetitiveDiveFeet('C', 100, 30);
//		assertTrue(minutes == 15);
//	}
	
	@Test
	public void testdecompressionStopMinutesRepetitiveDiveMetersShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesRepetitiveDiveMeters('A', 10, 30);
		assertTrue(minutes == 0);
	}
	
	@Test
	public void testdecompressionStopMinutesRepetitiveDiveMetersShouldReturn1() {
		NAUIDiveTable table = new NAUIDiveTable();
		int minutes = table.decompressionStopMinutesRepetitiveDiveMeters('L', 18, 30);
		assertTrue(minutes == -1);
	}
	
//	@Test
//	public void testdecompressionStopMinutesRepetitiveDiveMetersShouldReturn15() {
//		NAUIDiveTable table = new NAUIDiveTable();
//		int minutes = table.decompressionStopMinutesRepetitiveDiveMeters('C', 30, 30);
//		assertTrue(minutes == 15);
//	}
}
