package Vehicles;

public class Vehicle {

    Engine engine;
    Tyres tyres;
    VehicleType vehicleType;

    public Vehicle(Engine engine, Tyres tyres, VehicleType vehicleType){

        this.engine = engine;
        this.tyres = tyres;
        this.vehicleType = vehicleType;

    }

}
