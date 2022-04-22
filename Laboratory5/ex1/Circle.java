package pacuraru.fabian.lab5.ex1;

public class Circle extends Shape{
    protected double radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}
