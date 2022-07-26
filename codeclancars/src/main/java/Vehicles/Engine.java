package Vehicles;

public class Engine {

    private String size;
    private String fuelType;

    public Engine(String size, String fuelType) {
        this.size = size;
        this.fuelType = fuelType;
    }

    public String getEngineSize() {
        return size;
    }

    public String getFuelType() {
        return fuelType;
    }
}
