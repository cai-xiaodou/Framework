package cn.com.sandi.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStratrgyFactory {
	
	private static final String ALI_PAY = "Alipay";
	private static final String JD_PAY = "Jdpay";
	private static final String WEICHART_PAY = "weiChartpay";
	private static final String DEFAULT_PAY = ALI_PAY;
	
	private static final Map<String, PayMent> STRATEGY_MAP = new HashMap<>();
	
	private PayStratrgyFactory() {}
	
	static {
		STRATEGY_MAP.put(ALI_PAY, new AliPay());
		STRATEGY_MAP.put(JD_PAY, new JdPay());
		STRATEGY_MAP.put(WEICHART_PAY, new WeiChartPay());
	}
	
	public static PayMent getPayStrategy(String payKey) {
		if (!STRATEGY_MAP.containsKey(payKey)) {
			return STRATEGY_MAP.get(DEFAULT_PAY);
		}
		return STRATEGY_MAP.get(payKey);
	}
}
