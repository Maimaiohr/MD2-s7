package baitap4;

public class Circle extends Shape{
    private double r;
    @Override
    public void getArea() {
        double S = Math.PI * r * r;
        System.out.println("dien tich hinh tron:"+S);
    }

    public Circle() {
    }

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

}
