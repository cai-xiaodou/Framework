package cn.com.sandi.pattern.factory.factoryMethod;

import cn.com.sandi.pattern.factory.ICourse;
import cn.com.sandi.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{

	@Override
	public ICourse create() {
		return new PythonCourse();
	}

}
