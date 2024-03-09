package com.springCore.Auto_Wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAuto {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("AutoWireconfig.xml");
       Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1);
    }
}
