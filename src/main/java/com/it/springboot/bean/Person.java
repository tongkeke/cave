package com.it.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2018-2020, 艾融软件有限公司
 *
 * @FileName: Person
 * @Author: dawsontong
 * @Date: 2020/5/6 16:45
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
//    @Email
//    @Value("${person.last-Name}")
    private  String lastName;
//    @Value("${person.age}")
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public Person() {
    }

    public Person(String lastName, Integer age, Boolean boss, Date birth, Map< String, Object > maps, List< Object > lists, Dog dog) {
        this.lastName = lastName;
        this.age = age;
        this.boss = boss;
        this.birth = birth;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map< String, Object > getMaps() {
        return maps;
    }

    public void setMaps(Map< String, Object > maps) {
        this.maps = maps;
    }

    public List< Object > getLists() {
        return lists;
    }

    public void setLists(List< Object > lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
