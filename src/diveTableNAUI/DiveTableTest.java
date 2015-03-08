package diveTableNAUI;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiveTableTest {

	/*@Test
	public void testDiveTable() {
		DiveTable table = new DiveTable();
	}*/

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnG() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(80, 27);
		assertTrue(letter == 'G');
	}

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnB() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(100, 5);
		assertTrue(letter == 'B');
	}

	@Test
	public void testGetLetterGroupFirstDiveFeetShouldReturnL() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveFeet(90, 50);
		assertTrue(letter == 'L');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnG() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(24, 27);
		assertTrue(letter == 'G');
	}
	
	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnB() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(30, 5);
		assertTrue(letter == 'B');
	}

	@Test
	public void testGetLetterGroupFirstDiveMetersShouldReturnL() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupFirstDiveMeters(27, 50);
		assertTrue(letter == 'L');
	}

	@Test
	public void testGetLetterNumberShouldReturn0() {
		DiveTable table = new DiveTable();
		int number = table.getLetterNumber('A');
		assertTrue(number == 0);
	}

	@Test
	public void testGetLetterNumberShouldReturn6() {
		DiveTable table = new DiveTable();
		int number = table.getLetterNumber('G');
		assertTrue(number == 6);
	}

	@Test
	public void testGetLetterNumberShouldReturn11() {
		DiveTable table = new DiveTable();
		int number = table.getLetterNumber('L');
		assertTrue(number == 11);
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnA() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('A', 120);
		assertTrue(letter == 'A');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnH() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('J', 75);
		assertTrue(letter == 'H');
	}

	@Test
	public void testGetLetterGroupSurfaceIntervalTimeShouldReturnK() {
		DiveTable table = new DiveTable();
		char letter = table.getLetterGroupSurfaceIntervalTime('L', 33);
		assertTrue(letter == 'K');
	}

}
