package pacuraru.fabian.lab10.ex6;

public class Clock extends Thread{
    public int h=0, m=0, s=-1;
    boolean pause = false;
    public final Object pauseLock = new Object();

    public void run () {
        synchronized (pauseLock) {
            pauseLock.notify();
            for (h = 0; h < 24; h++) {
                for (m = 0; m < 60; m++) {
                    for (s = 0; s < 60; s++) {
                        if (pause) {
                            try {
                                pauseLock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
