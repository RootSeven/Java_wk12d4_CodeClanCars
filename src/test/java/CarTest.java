import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car1;
    private Engine engine1;
    private Tyre tyre1;

    @Before
    public void before(){
        engine1 = new Engine("petrol", "V8");
        tyre1 = new Tyre("Dunlop", "Winter", 55);
        car1 = new Car("Electric", engine1, tyre1, 10000, "blue", false);
    }

    @Test
    public void hasCarType(){
        assertEquals("Electric", car1.getCarType());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine1, car1.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre1, car1.getTyre());
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, car1.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car1.getColour());
    }

    @Test
    public void canCheckDamage(){
        assertEquals(false, car1.isDamaged());
    }

    @Test
    public void canDamageVehicle(){
        car1.damage();
        assertEquals(true, car1.isDamaged());
        assertEquals(8000, car1.getPrice());
    }

}
