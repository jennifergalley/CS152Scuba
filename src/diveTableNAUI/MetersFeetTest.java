package diveTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetersFeetTest {

	/*@Test
	public void testMetersFeet() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGetMeters() {
		MetersFeet mf = new MetersFeet(12, 40);
		int meters = mf.getMeters();
		assertTrue (meters == 12);
	}

	@Test
	public void testGetFeet() {
		MetersFeet mf = new MetersFeet(12, 40);
		int feet = mf.getFeet();
		assertTrue (feet == 40);
	}

	@Test
	public void testSetMeters() {
		MetersFeet mf = new MetersFeet();
		mf.setMeters(14);
		int meters = mf.getMeters();
		assertTrue (meters == 14);
	}

	@Test
	public void testSetFeet() {
		MetersFeet mf = new MetersFeet();
		mf.setFeet(14);
		int feet = mf.getFeet();
		assertTrue (feet == 14);
	}

	@Test
	public void testMetersToFeet() {
		MetersFeet mf = new MetersFeet();
		double feet = mf.metersToFeet(12);
		assertTrue (feet == 39.37008);
	}

	@Test
	public void testFeetToMeters() {
		MetersFeet mf = new MetersFeet();
		double meters = mf.feetToMeters(40);
		assertTrue (meters == 12.191999609856012);
	}

}
