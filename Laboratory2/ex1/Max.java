package pacuraru.fabian.lab2.ex1;

import java.util.Scanner;

public class Max {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print(Math.max(x, y));
    }
}
