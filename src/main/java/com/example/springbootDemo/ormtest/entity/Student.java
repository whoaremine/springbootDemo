package com.example.springbootDemo.ormtest.entity;

import com.example.springbootDemo.ormtest.annotation.Column;
import com.example.springbootDemo.ormtest.annotation.Table;

import java.util.Date;

@Table(tableName = "GCCARMP")
public class Student {

    @Column(columnName = "name_")
    public String name ;

    @Column(columnName = "age_")
    public int age;

    @Column(columnName = "birth_date")
    public Date birthDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
