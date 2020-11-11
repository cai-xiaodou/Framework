package cn.com.sandi.pattern.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;

public class CglibProxyTest {

	public static void main(String[] args) {
		
		
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cglib_proxy_classes");
		
		
		CglibMeipo cglibMeipo = new CglibMeipo();
		Customer instance = (Customer) cglibMeipo.getInstance(Customer.class);
		instance.findLove();
	}
}
