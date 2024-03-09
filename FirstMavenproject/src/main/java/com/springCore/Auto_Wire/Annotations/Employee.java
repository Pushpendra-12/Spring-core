package com.springCore.Auto_Wire.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("car1")
    private Car car;

    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        System.out.println("Setting car properties");
        this.car = car;
    }

    public Employee(Address address , Car car) {
        this.address = address;
        this.car = car;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", car=" + car +
                '}';
    }
}
