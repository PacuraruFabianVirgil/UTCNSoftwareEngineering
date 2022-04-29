package pacuraru.fabian.lab11.ex1;

public class TemperatureSensor extends Thread{
    MonitoringApp m = new MonitoringApp();

    public void run () {
        while(true) {
            int k = (int)(Math.random()*10000-3000);
            double n = (double)(k)/100;
            m.update(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        TemperatureSensor t = new TemperatureSensor();
        t.run();
    }
}
