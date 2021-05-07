import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Gary", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Gary", passenger.getName());
    }

    @Test
    public void canGetBags(){
        assertEquals(3, passenger.getBags());
    }

    @Test
    public void flightStartsAtNull(){
        assertEquals(null, passenger.getFlight());
    }

}
