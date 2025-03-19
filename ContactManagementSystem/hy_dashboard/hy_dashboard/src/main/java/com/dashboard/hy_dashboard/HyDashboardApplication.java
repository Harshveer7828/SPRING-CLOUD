package com.dashboard.hy_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HyDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyDashboardApplication.class, args);
	}

}
