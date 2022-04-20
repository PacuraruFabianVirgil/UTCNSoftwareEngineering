package pacuraru.fabian.lab3.ex2;

public class Circle {
    private double radius;
    private String color;
    public Circle(double rad, String col) {
        radius = rad;
        color = col;
    }
    public Circle(String col) {
        radius = 1.0;
        color = col;
    }
    public Circle(double rad) {
        radius = rad;
        color = "red";
    }
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public void getRadius() {
        System.out.print(radius + "\n");
    }
    public void getArea() {
        System.out.print(Math.PI * Math.pow(radius,2) + "\n");
    }
}
