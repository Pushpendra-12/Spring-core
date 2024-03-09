package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleUsingInterface implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice(){
        return price;
    }

    public LifeCycleUsingInterface() {
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "LifeCycleUsingInterface{" +
                "price=" + price +
                '}';
    }

    public LifeCycleUsingInterface(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("This is init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying");
    }
}
