package com.hph.spring.cloud.feign.service.privider.web.controller;

import com.hph.spring.cloud.feign.api.domain.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Random;

/**
 * @author {USER}
 * @date {date}
 */

@RestController
public class PersonServiceProviderController {

    private Random random;

    /**
     * 保存
     * @param person
     * @return 如果成功<code>true</code>
     */
    @PostMapping(value = "/person/save")
    public Boolean save(@RequestBody Person person){

        return true;
    }

    /**
     * 查找所有
     * @return collection
     */
    @GetMapping(value = "/person/find/all")
    public Collection<Person> findAll(){

        return null;
    }

    @GetMapping(value = "/hello-world")
    @HystrixCommand(fallbackMethod = "errorContent",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "100")})
    public String helloWorld() throws Exception {

        random = new Random();

        Thread.sleep(random.nextInt(200));

        return "Hello World";
    }

    public String errorContent(){

        return "error";
    }
}
