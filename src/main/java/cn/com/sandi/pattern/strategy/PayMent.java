package cn.com.sandi.pattern.strategy;

public abstract class PayMent {

	abstract String getName();
	
	abstract double queryAmount();
	
	protected MsgResult pay(double price) {
		if (price > queryAmount()) {
			return new MsgResult(500, "支付失败", "余额不足");
		}
		return new MsgResult(200, "支付成功", "本次消费金额："+price);
	}
}
