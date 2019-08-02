package com.hph.spring.cloud.feign.client;

import com.hph.spring.cloud.feign.api.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Person Client 应用程序
 * Eureka 客户端 + Feign 客户端
 * Feign ： person api + person client
 * @author HPH
 * @date 2019-07-17
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = PersonService.class)
public class PersonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonClientApplication.class,args);
    }
}
