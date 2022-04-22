package pacuraru.fabian.lab4.ex5;

public class Circle {
    public double radius;
    private String color;
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
