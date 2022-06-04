package edu.utcn.lab12.vehicles;

import java.util.ArrayList;


public class Parking {

    /**
     * Vehicles will be parked in parkedVehicles array.
     */
    ArrayList<Vehicle> parkedVehicles = new ArrayList<>();

    public void parkVehicle(Vehicle e){
        parkedVehicles.add(e);
    }

    /**
     * Sort vehicles by length.
     */
    public void sortByWeight(){
        for(int i = 0; i<parkedVehicles.size()-1; i++){
            for(int j=i+1; j<parkedVehicles.size(); j++){
                if(parkedVehicles.get(i).getWeight()>parkedVehicles.get(j).getWeight()){
                    Vehicle aux = parkedVehicles.get(i);
                    parkedVehicles.set(i, parkedVehicles.get(j));
                    parkedVehicles.set(j, aux);
                }
            }
        }
    }

    public Vehicle get(int index){
        return parkedVehicles.get(index);
    }

}
