package com.springCore.ContructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AdditionConfig.xml");
        Addition add = (Addition) context.getBean("add");
        add.doSum();


//        Book Book1 = (Book) context.getBean("Book1");
//        System.out.println(Book1);
//        System.out.println();
    }
}
