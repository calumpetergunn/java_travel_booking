import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.DOUGLASDC3);
        flight = new Flight(plane, "NZ75", "AKL", "LDN", "10:45");
        flightManager = new FlightManager(flight);
        passenger = new Passenger("Roger", 2);
    }

    @Test
    public void canCalculateWeightAllocation(){
        assertEquals(54, flightManager.calculateWeightPerPassengerAllocation());
    }

    @Test
    public void canCalculateBookedWeight(){
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(216, flightManager.calculateBookedWeight());
    }

    @Test
    public void canCalculateRemainingWeightAllocation(){
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(2376, flightManager.calculateWeightRemainingOnFlight());
    }
}
