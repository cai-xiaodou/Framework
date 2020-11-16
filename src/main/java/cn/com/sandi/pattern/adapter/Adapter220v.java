package cn.com.sandi.pattern.adapter;

public class Adapter220v extends PowerPort220v implements Target{

	@Override
	public void powerPort110V() {
		String power = super.getPower();
		System.out.println("适配前电压: "+power);
		int powerPort = super.getPowerPort();
		powerPort = 110;
		super.setPowerPort(powerPort);
		System.out.println("适配后电压: "+super.getPower());
	}

	public static void main(String[] args) {
		Adapter220v test = new Adapter220v();
		test.powerPort110V();
	}
}
