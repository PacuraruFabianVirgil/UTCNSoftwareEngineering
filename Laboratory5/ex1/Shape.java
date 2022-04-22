package pacuraru.fabian.lab5.ex1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        String s;
        if(filled == true) {
            s = "filled";
        }
        else {
            s = "Not filled";
        }
        return "A Shape with color of " + color + " and " + s;
    }
}
