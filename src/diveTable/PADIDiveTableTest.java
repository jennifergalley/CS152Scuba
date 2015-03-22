package diveTable;

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

}
