package org.example;

public class Student {
    private int StudentId;
    private String name;
    private String Address;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Setting student id");
        this.StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int studentId, String name, String address) {
        StudentId = studentId;
        this.name = name;
        Address = address;
    }
}
