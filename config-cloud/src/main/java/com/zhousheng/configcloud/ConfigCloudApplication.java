package com.zhousheng.configcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCloudApplication.class, args);
	}

}
