package cn.com.sandi.pattern.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibMeipo implements MethodInterceptor{

	
	public Object getInstance(Class<?> clz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clz);
		enhancer.setCallback(this);
		Object obj = enhancer.create();
		return obj;
	}
	
	@Override
	public Object intercept(Object obj, Method m, Object[] arg2, MethodProxy proxy) throws Throwable {
		
		System.out.println("相亲前准备。。。");
		Object object = proxy.invokeSuper(obj, arg2);
		System.out.println("相亲后。。。");
		return object;
	}

	
	

}
