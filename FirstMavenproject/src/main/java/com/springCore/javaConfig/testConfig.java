package com.springCore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testConfig {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        Student st = con.getBean("firstStudent",Student.class);
        //Student st = con.getBean("getStudent",Student.class);
        System.out.println(st);
        st.study();
    }
}
