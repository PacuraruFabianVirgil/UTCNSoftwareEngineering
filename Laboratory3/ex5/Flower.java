package pacuraru.fabian.lab3.ex5;

public class Flower {
    int petal;
    static int counter;
    Flower(){
        System.out.println("Flower has been created!");
        counter += 1;
    }
    public static int getCounter(){
        return counter;
    }
    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for(int i=0;i<5;i++){
            Flower f = new Flower();
            garden[i] = f;
        }
        System.out.print("The number of constructed flowers is: " + Flower.getCounter() + ".\n");
    }
}
