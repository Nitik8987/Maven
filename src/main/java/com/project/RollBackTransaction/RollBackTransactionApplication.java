package com.project.RollBackTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.RollBackTransaction.service.ServiceImpl;

@SpringBootApplication
public class RollBackTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RollBackTransactionApplication.class, args);

		ServiceImpl serviceImpl = context.getBean(ServiceImpl.class);

		serviceImpl.saveData();
	}

}
