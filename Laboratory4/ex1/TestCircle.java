package pacuraru.fabian.lab4.ex1;

public class TestCircle {
    public static void main(String[] Args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.3);
        System.out.print(circle1.getRadius() + "\n");
        System.out.print(circle2.getRadius() + "\n");
        System.out.print(circle2.getArea() + "\n");
    }
}
