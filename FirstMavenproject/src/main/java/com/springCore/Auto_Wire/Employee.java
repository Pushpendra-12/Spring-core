package com.springCore.Auto_Wire;

public class Employee {
    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
