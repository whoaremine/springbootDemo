package com.example.springbootDemo.designpatterns;


import com.example.springbootDemo.designpatterns.singletompattern.Emperor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmperorTest {

    @Test
    public void test(){
        Emperor emperor = Emperor.getInstance();
    }
}
