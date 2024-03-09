package com.springCore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testPerson {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standAlone.xml");
        person p1 = context.getBean("person1",person.class);
        System.out.println(p1.getFriends());
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(p1.getFeestruct());
        System.out.println(p1.getFeestruct().getClass().getName());
    }
}
