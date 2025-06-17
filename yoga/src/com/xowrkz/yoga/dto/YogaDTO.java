package com.xowrkz.yoga.dto;

import java.io.Serializable;

public class YogaDTO implements Serializable {

    private String name;
    private String age;
    public YogaDTO (){
        System.out.println("no-arg const of yogadto");
    }

    public YogaDTO(String name,String age){
       this.name=name;
       this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
