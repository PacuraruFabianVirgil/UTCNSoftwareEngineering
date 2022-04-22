package pacuraru.fabian.lab5.ex3;

import java.util.concurrent.TimeUnit;

public class Controller {
    public static void control() throws InterruptedException {
        Sensor[] sensor = new Sensor[2];
        sensor[0] = new LightSensor();
        sensor[1] = new TemperatureSensor();
        int[] lightSensor = new int[20];
        int[] tempSensor = new int[20];
        for (int i=0; i<20 ;i++) {
            TimeUnit.SECONDS.sleep(1);
            lightSensor[i] = sensor[0].readValue();
            tempSensor[i] = sensor[1].readValue();
            System.out.print(lightSensor[i] + "  ");
            System.out.print(tempSensor[i] + "\n");
        }
    }
}
