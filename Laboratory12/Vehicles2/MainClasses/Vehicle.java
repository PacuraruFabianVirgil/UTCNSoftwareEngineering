package edu.utcn.lab12.vehicles;

public class Vehicle {

    private String type;
    private int weight;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public int getWeight(){
        return weight;
    }

    public String start(){
        return "engine started";
    }

}
