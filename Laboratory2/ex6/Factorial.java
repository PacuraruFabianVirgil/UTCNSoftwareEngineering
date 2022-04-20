package pacuraru.fabian.lab2.ex6;

import java.util.Scanner;

public class Factorial {
    static int z=1;
    public static void main(String[] args) {
        int fact = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=2;i<=n;i++){
            fact = fact * i;
        }
        System.out.print(fact);
        System.out.print('\n');
        rec(n);
    }
    public static void rec(int m){
        if (m==1){
            System.out.print(z);
        }
        if (m!=0) {
            z = z * m;
            m-=1;
            rec(m);
        }
    }
}
