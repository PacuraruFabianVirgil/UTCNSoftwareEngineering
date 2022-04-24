package pacuraru.fabian.lab7.ex1;

public class CoffeeMaker {
    public static int counter=0;
    Coffee makeCoffee(){
        counter++;
        System.out.println("Make a coffee");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        Coffee coffee = new Coffee(t,c);
        return coffee;
    }
}
