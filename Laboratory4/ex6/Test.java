package pacuraru.fabian.lab4.ex6;

public class Test {
    public static void main(String[] Args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("yellow", true);
        shape1.setColor("black");
        System.out.print(shape1.getColor() + "\n");
        shape2.setFilled(false);
        System.out.print(shape2.isFilled() + "\n");
        System.out.print(shape1.toString() + "\n");
        System.out.print(shape2.toString() + "\n");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.2);
        Circle circle3 = new Circle(1.9, "magenta", true);
        circle1.setRadius(4.3);
        System.out.print(circle1.getRadius() + "\n");
        System.out.print(circle2.getArea() + "\n");
        System.out.print(circle3.getPerimeter() + "\n");
        System.out.print(circle3.toString() + "\n");
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(7.2, 8.9);
        Rectangle rectangle3 = new Rectangle(4.6, 7.5, "blue", false);
        rectangle1.setLength(11.4);
        rectangle1.setWidth(6.7);
        System.out.print(rectangle1.getLength() + "\n");
        System.out.print(rectangle1.getWidth() + "\n");
        System.out.print(rectangle2.getArea() + "\n");
        System.out.print(rectangle2.getPerimeter() + "\n");
        System.out.print(rectangle3.toString() + "\n");
        Square square1 = new Square();
        Square square2 = new Square(5.4);
        Square square3 = new Square(5.4, "white", false);
        square1.setLength(2.9);
        square2.setSide(8.2);
        square3.setWidth(4.7);
        System.out.print(square1.getSide() + "\n");
        System.out.print(square2.getSide() + "\n");
        System.out.print(square3.toString() + "\n");
    }
}
