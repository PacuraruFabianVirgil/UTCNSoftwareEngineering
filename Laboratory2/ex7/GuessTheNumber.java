package pacuraru.fabian.lab2.ex7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int rand1 = rand.nextInt(10);
        int tries = 3;
        while (tries!=0) {
            System.out.print("Write your guess:");
            int n = in.nextInt();
            if (n==rand1){
                System.out.print("Correct answer, you win");
                break;
            }
            else if (n<rand1){
                System.out.print("Wrong answer, your number is too low\n");
            }
            else System.out.print("Wrong answer, your number is too high\n");
            tries--;
            if (tries==0){
                System.out.print("You lost");
            }
        }
    }
}
