package pacuraru.fabian.lab4.ex6;

public class Square extends Rectangle {
    public Square() {
        super.setWidth(1.0);
        super.setLength(1.0);
    }
    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "A Square, which is a subclass of " + super.toString();
    }
}
