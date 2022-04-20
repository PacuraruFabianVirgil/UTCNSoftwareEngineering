package pacuraru.fabian.lab2.ex2;

import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x==1){
            System.out.print("ONE");
        }
        else if (x==2){
            System.out.print("TWO");
        }
        else if (x==3){
            System.out.print("THREE");
        }
        else if (x==4){
            System.out.print("FOUR");
        }
        else if (x==5){
            System.out.print("FIVE");
        }
        else if (x==6){
            System.out.print("SIX");
        }
        else if (x==7){
            System.out.print("SEVEN");
        }
        else if (x==8){
            System.out.print("EIGHT");
        }
        else if (x==9){
            System.out.print("NINE");
        }
        else System.out.print("OTHER");
        System.out.print('\n');
        switch (x){
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
            default:
                System.out.print("OTHER");
        }
    }
}
