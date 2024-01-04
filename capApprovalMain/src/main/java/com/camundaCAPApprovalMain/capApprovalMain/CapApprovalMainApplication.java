package com.camundaCAPApprovalMain.capApprovalMain;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableZeebeClient
public class CapApprovalMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapApprovalMainApplication.class, args);
	}

}
