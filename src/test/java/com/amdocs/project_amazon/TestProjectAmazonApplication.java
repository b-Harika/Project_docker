package com.amdocs.project_amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestProjectAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjectAmazonApplication::main).with(TestProjectAmazonApplication.class).run(args);
	}

}
