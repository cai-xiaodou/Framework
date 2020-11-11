package cn.com.sandi.pattern.strategy;

public class AliPay extends PayMent{

	@Override
	String getName() {
		return "Ö§¸¶±¦";
	}

	@Override
	double queryAmount() {
		return 900;
	}

}
