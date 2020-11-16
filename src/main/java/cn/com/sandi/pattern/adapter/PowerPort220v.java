package cn.com.sandi.pattern.adapter;

public class PowerPort220v {
	
	private int powerPort = 220;

	public int getPowerPort() {
		return powerPort;
	}

	public void setPowerPort(int powerPort) {
		this.powerPort = powerPort;
	}
	
	public String getPower() {
		return powerPort + "V";
	}
	
}
