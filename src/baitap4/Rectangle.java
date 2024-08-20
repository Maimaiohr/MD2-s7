package baitap4;

public class Rectangle extends Shape{
    private double a;
    private double b;

    @Override
    public void getArea() {
        double S =a*b;
        System.out.println("Dien tich hing cn la:"+S);
    }

    public Rectangle() {
    }

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;

    }



}
