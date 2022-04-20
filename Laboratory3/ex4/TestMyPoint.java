package pacuraru.fabian.lab3.ex4;

public class TestMyPoint {
    public static void main (String[] args){
        MyPoint point0 = new MyPoint();
        System.out.print(point0.getY() +"\n");
        point0.setX(4);
        point0.setY(-2);
        MyPoint point1 = new MyPoint(2,7);
        point1.setXY(-9,5);
        System.out.print(point1.getX() +"\n");
        System.out.print(point0.toString() +"\n");
        System.out.print(point1.distance(3,-8)+ "\n");
        System.out.print(point1.distance(point0) + "\n");
    }
}
