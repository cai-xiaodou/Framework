package cn.com.sandi.pattern.factory.factoryMethod;

import cn.com.sandi.pattern.factory.ICourse;
import cn.com.sandi.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{

	@Override
	public ICourse create() {
		return new JavaCourse();
	}

}
