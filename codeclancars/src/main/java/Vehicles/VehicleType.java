package Vehicles;

public enum VehicleType {

    CAR("5000", "Red"),
    ELECTRIC("8000", "Pink" ),
    HYBRID("12000", "Sky Blue");


    private String price, colour;

    VehicleType(String price, String colour){
        this.price = price;
        this.colour = colour;
    }

    public String getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

}
