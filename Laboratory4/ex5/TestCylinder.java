package pacuraru.fabian.lab4.ex5;

public class TestCylinder {
    public static void main(String[] Args) {
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.7);
        Cylinder cylinder3 = new Cylinder(1.7, 3.2);
        System.out.print(cylinder1.getArea() + "\n");
        System.out.print(cylinder2.getRadius() + "\n");
        System.out.print(cylinder2.getArea() + "\n");
        System.out.print(cylinder3.getHeight() + "\n");
        System.out.print(cylinder3.getVolume() + "\n");
    }
}
