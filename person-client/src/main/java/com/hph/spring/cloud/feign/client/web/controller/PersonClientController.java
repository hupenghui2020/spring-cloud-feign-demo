package com.hph.spring.cloud.feign.client.web.controller;

import com.hph.spring.cloud.feign.api.domain.Person;
import com.hph.spring.cloud.feign.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

/**
 * 需要实现服务的接口
 * @author HPH
 * @date 2019-07-17
 */

@RestController
public class PersonClientController implements PersonService{


    private final PersonService personService;

    @Autowired
    public PersonClientController(PersonService personService) {
        this.personService = personService;
    }


    @Override
    public Boolean save(Person person) {
        return personService.save(person);
    }

    @Override
    public Collection<Person> findAll() {
        return personService.findAll();
    }

    @Override
    public String helloWorld() {
        return personService.helloWorld();
    }
}
