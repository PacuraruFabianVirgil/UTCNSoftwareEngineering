package pacuraru.fabian.lab5.ex4;

public abstract class Sensor {
    public String location;
    public abstract int readValue();
    public String getLocation(){
        return location;
    }
}
