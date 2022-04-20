package pacuraru.fabian.lab3.ex1;

public class Robot {
    int x;
    public Robot() {
        x = 1;
    }
    public void change(int k) {
        x += k;
    }
    public String toString() {
        return String.valueOf(x);
    }
}