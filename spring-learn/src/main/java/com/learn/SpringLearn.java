package com.learn;

import com.learn.bean.ExampleBean;
import com.learn.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLearn {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
		System.out.println(exampleBean);
	}

}
