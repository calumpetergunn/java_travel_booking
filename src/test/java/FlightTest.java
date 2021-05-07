import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.AIRBUSA380);
        plane2 = new Plane(PlaneType.CESSNA172);
        flight1 = new Flight(plane1, "NZ75", "AKL", "LDN", "10:45");
        flight2 = new Flight(plane2, "BA33", "LAX", "CHC", "23:00");

        passenger = new Passenger("Gary", 3);
    }

    @Test
    public void flightPassengerListStartsEmpty(){
        assertEquals(0, flight1.getPassengerListSize());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.AIRBUSA380, flight1.getPlane());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("NZ75", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("AKL", flight1.getDestination());
    }

    @Test
    public void flightHasOrigin(){
        assertEquals("LDN", flight1.getOrigin());
    }

    @Test
    public void flightHasDepartTime(){
        assertEquals("10:45", flight1.getDepartTime());
    }


    @Test
    public void canGetAvailableSeats(){
        assertEquals(525, flight1.getAvailableSeats());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight1.addPassengerToFlight(passenger);
        assertEquals(1, flight1.getPassengerListSize());
        assertEquals(524, flight1.getAvailableSeats());
    }

    @Test
    public void cantAddPassengerToFlight(){
        flight2.addPassengerToFlight(passenger);
        flight2.addPassengerToFlight(passenger);
        flight2.addPassengerToFlight(passenger);
        flight2.addPassengerToFlight(passenger);
        assertEquals(3, flight2.getPassengerListSize());
        assertEquals(0, flight2.getAvailableSeats());
    }
}
