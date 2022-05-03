package edu.utcn.lab12.vehicles;

public class ElectricBattery{

    /**
     * Percentage load.
     */
    private int charge = 0;

    public void charge() throws BatteryException{
        charge++;
        if(charge>100)
            throw new BatteryException("charge is too big");
    }

}
