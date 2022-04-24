package pacuraru.fabian.lab7.ex1;

public class CoffeeDrinker {
    void drinkCoffee(Coffee c) throws LimitException, TemperatureException, ConcentrationException {
        if(CoffeeMaker.counter>5)
            throw new LimitException("Too many coffees!");
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffee is too hot!");
        if(c.getCon()>50)
            throw new ConcentrationException(c.getCon(),"Coffee concentration is too high!");
        System.out.println("Drink coffee:"+c+"\n");
    }
}
