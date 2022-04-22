package pacuraru.fabian.lab5.ex4;

import java.util.Random;

public class LightSensor extends Sensor {
    public int readValue() {
        Random light = new Random();
        return light.nextInt(100);
    }
}
