package cn.com.sandi.pattern.factory.abstractFactory;

import cn.com.sandi.pattern.factory.ICourse;
import cn.com.sandi.pattern.factory.factoryMethod.JavaCourseFactory;
import cn.com.sandi.pattern.factory.factoryMethod.PythonCourseFactory;

public class CourseFactory extends AbstractFactory{

	@Override
	ICourse getJavaCourse() {
		// TODO Auto-generated method stub
		return new JavaCourseFactory().create();
	}

	@Override
	ICourse getPythonCourse() {
		// TODO Auto-generated method stub
		return new PythonCourseFactory().create();
	}

}
