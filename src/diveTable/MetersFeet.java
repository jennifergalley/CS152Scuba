package diveTable;

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
