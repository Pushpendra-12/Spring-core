package com.springCore.Collections;

import java.util.*;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> Addresses;
    private Map<String,String> cources;



    public Employee() {
    }

    public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> cources) {
        this.name = name;
        this.phones = phones;
        Addresses = addresses;
        this.cources = cources;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddresses(Set<String> addresses) {
        Addresses = addresses;
    }

    public void setCources(Map<String, String> cources) {
        this.cources = cources;
    }

    public List<String> getPhones() {
        return phones;
    }

    public Set<String> getAddresses() {
        return Addresses;
    }

    public Map<String, String> getCources() {
        return cources;
    }
}
