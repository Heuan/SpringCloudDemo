package com.zuuldemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *  监控 /actuator/hystrix.stream
 */
@SpringBootApplication(scanBasePackages = {"com.zuuldemo.demo.*"})
@EnableZuulProxy
@EnableHystrixDashboard
public class ZuulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulDemoApplication.class, args);
    }

}
