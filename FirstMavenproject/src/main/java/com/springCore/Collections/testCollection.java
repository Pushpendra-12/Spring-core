package com.springCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCollection {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Employee Emp1 = (Employee) context.getBean("Emp1");
        Employee Emp2 = (Employee) context.getBean("Emp2");

        System.out.println(Emp2.getName());
        System.out.println(Emp2.getPhones());
        System.out.println(Emp2.getAddresses());
        System.out.println(Emp2.getCources());

        System.out.println(Emp1.getPhones().getClass().getName());
    }
}
