package com.wyj.kingdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // 要使用Feign，需要加上此注解
public class KingdogApplication {

	public static void main(String[] args) {
		SpringApplication.run(KingdogApplication.class, args);
	}

}
