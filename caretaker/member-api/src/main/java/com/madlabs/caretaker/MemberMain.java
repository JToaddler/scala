package com.madlabs.caretaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication(scanBasePackages = { "com.madlabs.*" })
public class MemberMain implements CommandLineRunner {

	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(MemberMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" zcc " + context);
	}
}