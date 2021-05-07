import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.AIRBUSA380, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(525, plane.getPlaneCapacity());
    }

    @Test
    public void planeHasPayload(){
        assertEquals(112760, plane.getPlanePayload());
    }

}
