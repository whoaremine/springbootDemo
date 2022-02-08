package com.example.springbootDemo.ormtest;

import com.example.springbootDemo.ormtest.annotation.Column;
import com.example.springbootDemo.ormtest.annotation.Table;
import com.example.springbootDemo.ormtest.entity.Student;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.Date;

@SpringBootTest
public class OrmTest {

    @Test
    public void ormTest() throws IllegalAccessException {
        Student stu = new Student();
        stu.setName("Kai");
        stu.setBirthDate(new Date());
        Class studentClass = stu.getClass();

        if(studentClass.isAnnotationPresent(Table.class)){
            Table table = (Table) studentClass.getAnnotation(Table.class);
            System.out.println(table.tableName());
        }
        Field[] fields = studentClass.getDeclaredFields();
       for (Field field:fields){
           if(field.isAnnotationPresent(Column.class)){
            Column column=(Column)field.getAnnotation(Column.class);//Getting annotation information
            System.out.println(column.columnName());
            System.out.println(field.get(stu));
           }
       }
    }
}
