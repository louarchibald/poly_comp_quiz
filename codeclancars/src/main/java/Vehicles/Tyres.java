package Vehicles;

public class Tyres {

    private int size;
    private String grip;

    public Tyres(int size, String grip) {
        this.size = size;
        this.grip = grip;
    }

    public int getTyreSize() {
        return size;
    }

    public String getTyreGrip() {
        return grip;
    }
}
