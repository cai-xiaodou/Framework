package cn.com.sandi.pattern.strategy;

public abstract class PayMent {

	abstract String getName();
	
	abstract double queryAmount();
	
	protected MsgResult pay(double price) {
		if (price > queryAmount()) {
			return new MsgResult(500, "֧��ʧ��", "����");
		}
		return new MsgResult(200, "֧���ɹ�", "�������ѽ�"+price);
	}
}
