package sales;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    Vehicle vehicle;
    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, double money, ArrayList<Vehicle> ownedVehicles){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public double getCustomerMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public String getCustomerName() {
        return name;
    }

    public int getSize(){
        return ownedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        ownedVehicles.add(vehicle);
    }
}
