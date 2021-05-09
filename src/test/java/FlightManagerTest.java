import org.junit.Before;
import org.junit.Test;


import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.DOUGLASDC3);
        flight = new Flight(plane, "NZ75", "AKL", "LDN", LocalTime.of(10,45));
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

    @Test
    public void canBookTrip(){
        flightManager.bookTrip(flight, passenger);
        assertEquals(1, flight.getPassengerListSize());
        assertEquals("AKL", passenger.getFlight().getDestination());
        assertNotEquals(0, passenger.getSeatNumber());
    }
}
