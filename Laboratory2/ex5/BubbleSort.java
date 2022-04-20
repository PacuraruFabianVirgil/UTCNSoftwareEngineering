package pacuraru.fabian.lab2.ex5;

import java.util.Scanner;
import java.util.Vector;

public class BubbleSort {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        int n, temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            temp = in.nextInt();
            v.add(temp);
        }
        int swap=1;
        while (swap!=0) {
            swap=0;
            for (int i = 1; i < n; i++) {
                if (v.get(i - 1) > v.get(i)) {
                    int aux1 = v.get(i - 1);
                    int aux2 = v.get(i);
                    v.set(i - 1, aux2);
                    v.set(i, aux1);
                    swap++;
                }
            }
        }
        System.out.print(v);
    }
}
