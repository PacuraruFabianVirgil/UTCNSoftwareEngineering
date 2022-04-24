package pacuraru.fabian.lab7.ex1;

public class Coffee {
    private int temp;
    private int con;

    Coffee(int t,int c){temp = t;con = c;}
    int getTemp(){return temp;}
    int getCon(){return con;}
    public String toString(){return "[coffee temperature="+temp+":concentration="+con+":number="+CoffeeMaker.counter+"]";}
}
