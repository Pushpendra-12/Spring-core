package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleUsingAnnotation {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LifeCycleUsingAnnotation() {
    }

    @Override
    public String toString() {
        return "LifeCycleUsingAnnotation{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public LifeCycleUsingAnnotation(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending method");
    }
}
