package com.example.springbootDemo.postmantest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostmanAccessController {




    @Autowired
    ApplicationContext applicationContext;


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        Student student = applicationContext.getBean(Student.class);
        student.setName(name);
        student.setName2(name);
        return String.format("Hello %s!", student.getName());
    }
}
