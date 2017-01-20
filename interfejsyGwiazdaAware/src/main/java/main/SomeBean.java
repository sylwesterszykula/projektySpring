package main;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements BeanNameAware, ApplicationContextAware {
	private String name;
	private ApplicationContext applicationContext;

	public void setBeanName(String name) {
		this.name = name;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

	private void init() {
		Map<String, SomeBean> beansOfType = applicationContext.getBeansOfType(SomeBean.class);
		System.out.println("Nazwa " + name + ". Rozmiar " + beansOfType.size());
	}

}
