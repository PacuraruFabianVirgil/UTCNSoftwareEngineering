package pacuraru.fabian.lab5.ex1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Circle();
        shapes[1] = new Circle(3.4);
        shapes[2] = new Circle(5.1, "blue", false);
        shapes[3] = new Rectangle();
        shapes[4] = new Rectangle(3.7, 9.2);
        shapes[5] = new Rectangle(2.9, 8.6, "black", true);
        shapes[6] = new Square();
        shapes[7] = new Square(4.9);
        shapes[8] = new Square(4.5, "red", false);
        System.out.print(shapes[0].toString() + "\n");
        System.out.print(shapes[1].getArea() + "\n");
        System.out.print(shapes[2].getPerimeter() + "\n");
        System.out.print(shapes[3].toString() + "\n");
        System.out.print(shapes[4].getArea() + "\n");
        System.out.print(shapes[5].getPerimeter() + "\n");
        System.out.print(shapes[6].toString() + "\n");
        System.out.print(shapes[7].getArea() + "\n");
        System.out.print(shapes[8].getPerimeter() + "\n");
        System.out.print(shapes[3].toString() + "\n");
        System.out.print(shapes[4].getArea() + "\n");
        System.out.print(shapes[5].getPerimeter() + "\n");
    }
}
