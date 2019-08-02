package com.hph.spring.cloud.feign.api.service;

import com.hph.spring.cloud.feign.api.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

/**
 * FeignClient.value: 服务提供方应用的名称
 * Feign ： person api + person client
 * {@link Person}服务
 * @author HPH
 * @date 2019-07-17
 */
@FeignClient(value = "person-service")
public interface PersonService {

    /**
     * 保存
     * @param person
     * @return 如果成功<code>true</code>
     */
    @PostMapping(value = "/person/save")
    Boolean save(Person person);

    /**
     * 查找所有
     * @return collection
     */
    @GetMapping(value = "/person/find/all")
    Collection<Person> findAll();

    /**
     * 测试熔断
     * @return String
     */
    @GetMapping(value = "/hello-world")
    String helloWorld();
}
