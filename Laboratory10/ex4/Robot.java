package pacuraru.fabian.lab10.ex4;

import java.util.Random;

public class Robot extends Thread{

    public static Robot[] allRobots = new Robot[10];
    int x, y, index;
    boolean deleted = false;
    boolean printed = false;
    Random rand = new Random();
    Robot(String name){
        super(name);
        index = Integer.parseInt(name.substring(5))-1;
        x = rand.nextInt(100);
        y = rand.nextInt(100);
    }

    public void run(){
        boolean done = false;
        while(!deleted) {
            while (!done) {
                int move = rand.nextInt(4);
                switch (move) {
                    case 0:
                        if (allRobots[index].x > 0) {
                            allRobots[index].x--;
                            done = true;
                        }
                        break;
                    case 1:
                        if (allRobots[index].x < 99) {
                            allRobots[index].x++;
                            done = true;
                        }
                        break;
                    case 2:
                        if (allRobots[index].y > 0) {
                            allRobots[index].y--;
                            done = true;
                        }
                        break;
                    case 3:
                        if (allRobots[index].y < 99) {
                            allRobots[index].y++;
                            done = true;
                        }
                        break;
                    default:
                        break;
                }
            }
            done = false;

            System.out.println(getName() + " is at ( " + this.x + " , " + this.y + " )");

            for (int i = 0; i < 10; i++) {
                if ((!printed) && (i != index) && (allRobots[i].x == allRobots[index].x) && (allRobots[i].y == allRobots[index].y)) {
                    deleted = true;
                    allRobots[index].deleted = true; allRobots[i].deleted = true;
                    allRobots[index].x = 100; allRobots[i].x = 100;
                    allRobots[index].y = 100; allRobots[i].y = 100;
                    System.out.println(allRobots[index].getName() + " has been destroyed");
                    System.out.println(allRobots[i].getName() + " has been destroyed");
                    printed = true;
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Robot r1 = new Robot("robot1"); Robot.allRobots[0]=r1;
        Robot r2 = new Robot("robot2"); Robot.allRobots[1]=r2;
        Robot r3 = new Robot("robot3"); Robot.allRobots[2]=r3;
        Robot r4 = new Robot("robot4"); Robot.allRobots[3]=r4;
        Robot r5 = new Robot("robot5"); Robot.allRobots[4]=r5;
        Robot r6 = new Robot("robot6"); Robot.allRobots[5]=r6;
        Robot r7 = new Robot("robot7"); Robot.allRobots[6]=r7;
        Robot r8 = new Robot("robot8"); Robot.allRobots[7]=r8;
        Robot r9 = new Robot("robot9"); Robot.allRobots[8]=r9;
        Robot r10 = new Robot("robot10"); Robot.allRobots[9]=r10;

        r1.start(); r2.start();
        r3.start(); r4.start();
        r5.start(); r6.start();
        r7.start(); r8.start();
        r9.start(); r10.start();
    }
}
