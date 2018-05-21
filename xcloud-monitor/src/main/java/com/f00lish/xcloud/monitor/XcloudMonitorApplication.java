package com.f00lish.xcloud.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableTurbine
public class XcloudMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(XcloudMonitorApplication.class, args);
	}
}
