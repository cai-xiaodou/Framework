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
		System.out.println("你选择的支付方式是："+pay.getName()+",订单号："+orderId+",支付金额："+amount);
		System.out.println("正在支付中，请稍等。。。");
		return pay.pay(amount);
	}

}
