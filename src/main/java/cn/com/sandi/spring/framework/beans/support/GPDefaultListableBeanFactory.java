package cn.com.sandi.spring.framework.beans.support;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.com.sandi.spring.framework.beans.config.GPBeanDefinition;
import cn.com.sandi.spring.framework.context.support.GPAbstractApplicationContext;

public class GPDefaultListableBeanFactory extends GPAbstractApplicationContext{

	
	private final Map<String, GPBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
	
	

}
