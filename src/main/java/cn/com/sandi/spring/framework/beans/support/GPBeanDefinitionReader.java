package cn.com.sandi.spring.framework.beans.support;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import cn.com.sandi.spring.framework.beans.config.GPBeanDefinition;

public class GPBeanDefinitionReader {

	private List<String> registyBeanClasses = new ArrayList<String>();
	private Properties config = new Properties();
	private final String SCAN_PACKAGE = "scanPackage";
	
	public GPBeanDefinitionReader(String... locations) {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(locations[0].replace("classpath:", ""));
		try {
			config.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		doScanner(config.getProperty(SCAN_PACKAGE));
	}
	
	private void doScanner(String scanPackage) {
		URL url = this.getClass().getClassLoader().getResource("/" + scanPackage.replaceAll("\\.", "/"));
		File classpath = new File(url.getFile());
		for (File file: classpath.listFiles()) {
			if (file.isDirectory()) {
				doScanner(scanPackage + "." + file.getName());
			} else {
				if (!file.getName().endsWith(".class")) continue;
				String className = scanPackage+"."+file.getName().replace(".class", "");
				registyBeanClasses.add(className);
			}
		}
		
	}

	public Properties getConfig() {
		return this.config;
	}
	
	public List<GPBeanDefinition> loadBeanDefinitions() {
		List<GPBeanDefinition> result = new ArrayList<>();
		try {
			for (String className : registyBeanClasses) {
				GPBeanDefinition beanDefinition = doCreateBeanDefinition(className);
				result.add(beanDefinition);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	private GPBeanDefinition doCreateBeanDefinition(String className) {
		try {
			Class<?> beanClass = Class.forName(className);
			if (!beanClass.isInterface()) {
				GPBeanDefinition beanDefinition = new GPBeanDefinition();
				beanDefinition.setBeanClassName(className);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
