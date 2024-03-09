package com.springCore.springExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTeacher {
    public static void main(String[] args) {
        ApplicationContext con =  new ClassPathXmlApplicationContext("SELconfig.xml");
        Teacher t1 = con.getBean("teacher",Teacher.class);
        System.out.println(t1);
    }
}
