package com.springCore.springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Value("#{20 + 10}")
    private int x;
    @Value("#{18 + 15}")
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(25)}")
    private double z;
    @Value("#{ T(java.lang.Math).E }")
    private double E;

    @Value("#{ new java.lang.String('Pushpendra')}")
    private String name;
    @Value("#{ 8 > 3 }")
    private boolean isActive;



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", E=" + E +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
