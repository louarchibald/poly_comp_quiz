package sales;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(ArrayList<Vehicle> stock, double till){

        this.stock = new ArrayList<Vehicle>();
        this.till = till;

    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }
}
