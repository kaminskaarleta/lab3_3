package lab3_3;

import edu.iis.mto.time.TimeSource;

public class FakeTime implements TimeSource{

	private long differenceTime;
	
	public FakeTime(long differenceTime){
		this.differenceTime = differenceTime;
	}
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + differenceTime;
	}
}
