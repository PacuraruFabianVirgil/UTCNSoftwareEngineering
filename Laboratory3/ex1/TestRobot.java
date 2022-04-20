package pacuraru.fabian.lab3.ex1;

public class TestRobot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.change(5);
        robot.change(7);
        System.out.print(robot.toString());
    }
}
