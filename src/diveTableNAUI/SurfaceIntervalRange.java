package diveTableNAUI;

public class SurfaceIntervalRange {
	private int min; //bottom number in NAUI Table 2, in minutes
	private int max; //top number in NAUI Table 2, in minutes
	
	public SurfaceIntervalRange () {}
	
	public SurfaceIntervalRange (int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int getMin () {
		return this.min;
	}
	
	public int getMax () {
		return this.max;
	}
	
	public void setMin (int min) {
		this.min = min;
	}
	
	public void setMax (int max) {
		this.max = max;
	}
	
	public double minutesToHours (int minutes) {
		return ((double) minutes) / 60.0;
	}
	
	public double hoursToMinutes (double hours) {
		return  hours * 60;
	}
	
	public String prettyPrint (int minutes) {
		int h = minutes / 60;
		int m = minutes - (60 * h);
		String s = h + ":";
		if (m < 10)
			s += "0";
		return s + m;
	}
}
