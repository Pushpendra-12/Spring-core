package com.springCore.lifeCycle;

public class BeanLifeCycle {
    private double price;

    public BeanLifeCycle() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
