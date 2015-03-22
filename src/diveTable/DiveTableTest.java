package diveTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class NAUIDiveTableTest {

	/*@Test
	public void testNAUIDiveTable() {
		NAUIDiveTable table = new NAUIDiveTable();
	}*/

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
	public void testGetLetterNumberShouldReturn0() {
		NAUIDiveTable table = new NAUIDiveTable();
		int number = table.getLetterNumber('A');
		assertTrue(number == 0);
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

}
