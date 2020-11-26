package cn.com.sandi.spring.framework.context;

import java.util.List;

import cn.com.sandi.spring.framework.beans.GPBeanFactory;
import cn.com.sandi.spring.framework.beans.config.GPBeanDefinition;
import cn.com.sandi.spring.framework.beans.support.GPBeanDefinitionReader;
import cn.com.sandi.spring.framework.beans.support.GPDefaultListableBeanFactory;

public class GPApplicationContext extends GPDefaultListableBeanFactory implements GPBeanFactory{

	private String[] configLocations;
	private GPBeanDefinitionReader reader;
	
	public GPApplicationContext(String... configLocations) {
		this.configLocations = configLocations;
		refresh();
	}
	
	@Override
	public void refresh() {
		// 1、定位配置文件
		reader = new GPBeanDefinitionReader(this.configLocations);
		
		// 2、加载配置文件，扫描相关 的类，封装成BeanDefinition
		List<GPBeanDefinition> beanDefinitions = reader.loadBeanDefinitions();
		
		// 3、注册
		doRegisterBeanDefinitions(beanDefinitions);
		
		// 4、把不是延时加载的类进行初始化
		doAutowrited();
		
	}
	
	private void doAutowrited() {
		
	}

	private void doRegisterBeanDefinitions(List<GPBeanDefinition> beanDefinitions) {
		
	}

	@Override
	public Object getBean(String beanName) {
		
		return null;
	}
	
}
