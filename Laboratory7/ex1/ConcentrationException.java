package pacuraru.fabian.lab7.ex1;

public class ConcentrationException extends Exception{
    int c;
    public ConcentrationException(int c,String msg) {
        super(msg);
        this.c = c;
    }

    int getCon(){
        return c;
    }
}
