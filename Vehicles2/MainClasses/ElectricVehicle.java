package edu.utcn.lab12.vehicles;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String type, int weight) {
        super(type, weight);
    }

    @Override
    public String start(){
        return "electric engine started";
    }
}
