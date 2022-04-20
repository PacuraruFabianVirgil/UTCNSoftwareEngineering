package pacuraru.fabian.lab3.ex2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"green");
        circle1.getArea();
        Circle circle2 = new Circle(8);
        circle2.getRadius();
        Circle circle3 = new Circle("black");
        circle3.getRadius();
        Circle circle4 = new Circle();
        circle4.getArea();
    }
}
