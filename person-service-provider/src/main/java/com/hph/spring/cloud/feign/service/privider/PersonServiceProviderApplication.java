package com.hph.spring.cloud.feign.service.privider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * eureka 客户端 + Hystrix
 * @author HPH
 * @date {date}
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class PersonServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonServiceProviderApplication.class,args);
    }
}
