package pacuraru.fabian.lab4.ex5;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        height = 1.0;
    }
    public Cylinder(double radius) {
        height = 1.0;
        super.radius = radius;
    }
    public Cylinder(double radius, double height) {
        this.height = height;
        super.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        double area = 2*(Math.PI * Math.pow(super.getRadius(),2) + height * Math.PI * super.getRadius());
        return area;
    }
    public double getVolume() {
        double volume = height * Math.PI * Math.pow(super.getRadius(),2);
        return volume;
    }
}
