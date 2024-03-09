package com.springCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student st = context.getBean("object", Student.class);
        System.out.println(st);
        System.out.println(st.getAddress());
        System.out.println(st.hashCode());
    }
}
