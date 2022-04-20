package pacuraru.fabian.lab2.ex4;

import java.util.Scanner;
import java.util.Vector;

public class MaxElemInVector {
    public static void main(String[] args) {
        int max = 0;
        Vector<Integer> v = new Vector<>();
        int n,temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
                temp = in.nextInt();
                v.add(temp);
        }
        for (int i = 0; i < n; i++) {
            if (v.get(i) > max){
                max = v.get(i);
            }
        }
        System.out.print(max);
    }
}
