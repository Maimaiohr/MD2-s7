package baitap4;

public class test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("black",3,5);
        Circle circle = new Circle("red",3);

        rectangle.getArea();
        rectangle.getColor();

        circle.getArea();
        circle.getColor();
    }
}
