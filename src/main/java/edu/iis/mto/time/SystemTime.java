package edu.iis.mto.time;

public class SystemTime implements TimeSource{

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}

}
