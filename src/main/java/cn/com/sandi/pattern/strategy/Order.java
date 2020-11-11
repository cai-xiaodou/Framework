package cn.com.sandi.pattern.strategy;

public class Order {
	
	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public MsgResult pay(String payKey) {
		PayMent pay = PayStratrgyFactory.getPayStrategy(payKey);
		System.out.println("��ѡ���֧����ʽ�ǣ�"+pay.getName()+",�����ţ�"+orderId+",֧����"+amount);
		System.out.println("����֧���У����Եȡ�����");
		return pay.pay(amount);
	}

}
