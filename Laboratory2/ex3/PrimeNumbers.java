package pacuraru.fabian.lab2.ex3;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int i;
        int k;
        int count=0;
        int nrOfPrimeNumbers=0;
        for (i=x;i<=y;i++){
            for (k=2;k<=i/2;k++){
                if (i%k==0){
                    count++;
                }
            }
            if (count==0){
                System.out.print(i);
                System.out.print(' ');
                nrOfPrimeNumbers++;
            }
            count=0;
        }
        System.out.print('\n');
        System.out.print("Number of prime numbers is:");
        System.out.print(nrOfPrimeNumbers);
    }
}
