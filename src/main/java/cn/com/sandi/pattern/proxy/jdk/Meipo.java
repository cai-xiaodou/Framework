package cn.com.sandi.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.com.sandi.pattern.proxy.Person;

public class Meipo implements InvocationHandler{
	
	private Person person;
	
	public Object getInstance(Person target) {
		this.person = target;
		Class<? extends Person> clz = target.getClass();
		Object object = Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
		return object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("媒婆物色对象。。。");
		Object object = method.invoke(this.person, args);
		System.out.println("相亲结束。。。");
		return object;
	}

}
