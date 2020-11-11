package cn.com.sandi.pattern.proxy.jdk;

import cn.com.sandi.pattern.proxy.Person;

public class Girl implements Person{

	@Override
	public void findLove() {
		System.out.println("女孩要求：高富帅，有车有房有存款。。。");
	}

}
