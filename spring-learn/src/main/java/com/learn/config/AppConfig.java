package com.learn.config;

import com.learn.bean.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


	@Bean
	public ExampleBean exampleBean() {
		ExampleBean exampleBean = new ExampleBean();
		exampleBean.setParam1("param2");
		exampleBean.setParam2("param1");
		return exampleBean;
	}

}
