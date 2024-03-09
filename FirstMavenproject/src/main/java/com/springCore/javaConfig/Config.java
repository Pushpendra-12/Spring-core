package com.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore.javaConfig")
public class Config {
    @Bean
    public Student getStudent(){

        //creating new object
        Student student = new Student(getTeacher());
        return student;
    }

    @Bean
    public Teacher getTeacher(){
        return new Teacher();
    }
}
