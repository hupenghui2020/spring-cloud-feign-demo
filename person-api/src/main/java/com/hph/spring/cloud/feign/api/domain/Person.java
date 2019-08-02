package com.hph.spring.cloud.feign.api.domain;

/**
 * 人的模型
 * @author HPH
 * @date 2019-07-17
 */
public class Person {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
