package cn.com.sandi.pattern.strategy;

public class JdPay extends PayMent {

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "��������";
	}

	@Override
	double queryAmount() {
		// TODO Auto-generated method stub
		return 500;
	}

}
