package com.springCore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {


    private Teacher teacher;

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public void study(){
        this.teacher.teach();
        System.out.println("Student is reading book");
    }
}
