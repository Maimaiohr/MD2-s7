package baitap4;

import java.awt.*;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //phuong thuc truu tuong
    public abstract void getArea();
    //mau sac
    public void display(){
        System.out.println("mau sac:"+color);
    };
}
