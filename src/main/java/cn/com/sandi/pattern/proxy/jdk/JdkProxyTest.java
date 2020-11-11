package cn.com.sandi.pattern.proxy.jdk;

import java.io.FileOutputStream;

import cn.com.sandi.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

public class JdkProxyTest {

	public static void main(String[] args) throws Exception {
		
		Meipo meipo = new Meipo();
		Person person = (Person) meipo.getInstance(new Girl());
		person.findLove();
		
		byte[] b = ProxyGenerator.generateProxyClass("$proxy0", new Class[] {Person.class});
		FileOutputStream out = new FileOutputStream("E://$proxy0.class");
		out.write(b);
		out.close();
	}
}
