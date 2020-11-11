package cn.com.sandi.pattern.strategy;

public class TestMain {

	public static void main(String[] args) {
		Order order = new Order("1", "202013425433", 348.66);
		MsgResult result = order.pay("weiChartpay");
		System.out.println(result.toString());
	}
}
