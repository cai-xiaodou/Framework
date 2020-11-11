package cn.com.sandi.pattern.factory.abstractFactory;

import cn.com.sandi.pattern.factory.ICourse;

public abstract class AbstractFactory {

	
	abstract ICourse getJavaCourse();
	
	abstract ICourse getPythonCourse();
	
}
