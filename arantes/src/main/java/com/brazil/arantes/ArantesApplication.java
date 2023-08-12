package com.brazil.arantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // habilitando o uso do feign client
@SpringBootApplication
public class ArantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArantesApplication.class, args);
	}

}
