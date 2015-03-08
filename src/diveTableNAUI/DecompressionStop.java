package diveTableNAUI;

public class DecompressionStop {
	public int diveTime; //dive time requiring decompression
	public int stopTime; //minutes required at 15' stop
	
	public DecompressionStop (int diveTime, int stopTime) {
		this.diveTime = diveTime;
		this.stopTime = stopTime;
	}
	
	public int getDiveTime () {
		return this.diveTime;
	}
	
	public int getStopTime () {
		return this.stopTime;
	}
	
	public void setDiveTime (int diveTime) {
		this.diveTime = diveTime;
	}
	
	public void setStopTime (int stopTime) {
		this.stopTime = stopTime;
	}
}
