package lab3_3;

import edu.iis.mto.time.TimeSource;

public class FakeTime implements TimeSource{

	private long differenceTime;
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + differenceTime;
	}
	
	public void setDifferenceTime(long differenceTime) {
		this.differenceTime = differenceTime;
	}
}
