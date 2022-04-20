package pacuraru.fabian.lab3.ex4;

public class MyPoint {
    public int x;
    public int y;
    MyPoint() {
        x = 0;
        y = 0;
    }
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int newx) {
        x = newx;
    }
    public int getY() {
        return y;
    }
    public void setY(int newy) {
        y = newy;
    }
    public void setXY(int newx, int newy) {
        x = newx;
        y = newy;
    }
    public String toString() {
        return "(" + x + ", " + y +")";
    }
    public double distance(int x, int y) {
        double dist1 = (double) Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
        return dist1;
    }
    public double distance(MyPoint another) {
        double dist2 = (double) Math.sqrt(Math.pow(this.x-another.x, 2) + Math.pow(this.y-another.y, 2));
        return dist2;
    }
}
