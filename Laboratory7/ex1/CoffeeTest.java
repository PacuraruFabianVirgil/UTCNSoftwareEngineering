package pacuraru.fabian.lab7.ex1;

public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        for(int i = 0;i<15;i++){
            Coffee c = mk.makeCoffee();
            boolean success = false;
            try {
                d.drinkCoffee(c);
                success = true;
            } catch (LimitException e) {
                System.out.println("Exception:" + e.getMessage() + " nr=" + CoffeeMaker.counter);
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() + " temp="+e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() + " con=" + e.getCon());
            } finally {
                if (success==false) {
                    System.out.println("Throw the coffee cup.\n");
                }
            }
        }
    }
}
