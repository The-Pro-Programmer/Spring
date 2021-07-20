package com.itemCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ItemCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogApplication.class, args);
	}

}
