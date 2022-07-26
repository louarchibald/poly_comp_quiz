import Vehicles.Engine;
import Vehicles.Tyres;
import Vehicles.Vehicle;
import Vehicles.VehicleType;
import org.junit.Before;
import org.junit.Test;
import sales.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    VehicleType vehicleType;
    Tyres tyres;
    Engine engine;
    Vehicle vehicle;
    ArrayList<Vehicle> ownedVehicles;

    @Before
    public void before(){
        ownedVehicles = new ArrayList<>();
        customer = new Customer("Schmichael", 5500.00, ownedVehicles);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(5500.00, customer.getCustomerMoney(), 0.0);
    }

    @Test
    public void customerHasName(){
        assertEquals("Schmichael", customer.getCustomerName());
    }

    @Test
    public void vehicleListStartsEmpty(){
        assertEquals(0, customer.getSize());
    }

    @Test
    public void vehicleCanBeAddedToList(){
        tyres = new Tyres(30, "Strong");
        engine = new Engine("2litre", "Petrol");
        vehicle = new Vehicle(engine, tyres, vehicleType);
        customer.addVehicle(vehicle);
        assertEquals(1, customer.getSize());
    }

}
