package pacuraru.fabian.lab10.ex3;

public class Counters extends Thread{

    Counters(String name){
        super(name);
    }

    public void run1(){
        for(int i=0;i<100;i++){
            System.out.println(getName() + " is "+i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " is done incrementing");
    }

    public void run2(){
        for(int i=100;i<200;i++){
            System.out.println(getName() + " is "+i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " is done incrementing");
    }

    public static void main(String[] args) {
        Counters c1 = new Counters("counter1");
        Counters c2 = new Counters("counter2");

        c1.run1();
        c2.run2();
    }
}

