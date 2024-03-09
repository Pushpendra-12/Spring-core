package com.springCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLife {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle.xml");
        // registering shutdown hook
        context.registerShutdownHook();
//        BeanLifeCycle b1 = (BeanLifeCycle) context.getBean("S1");
//        System.out.println(b1);


//        System.out.println("++++++++++++++++++++++++++++");
//        LifeCycleUsingInterface b2 = (LifeCycleUsingInterface) context.getBean("S2");
//        System.out.println(b2);

        LifeCycleUsingAnnotation anno = (LifeCycleUsingAnnotation) context.getBean("example");
        System.out.println(anno);

    }
}
