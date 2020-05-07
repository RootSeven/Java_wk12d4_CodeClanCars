import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre1;

    @Before
    public void before(){
        tyre1 = new Tyre("Dunlop", "Winter", 55);
    }

    @Test
    public void hasBrand(){
        assertEquals("Dunlop", tyre1.getBrand());
    }

    @Test
    public void hasTyreType(){
        assertEquals("Winter", tyre1.getTyreType());
    }

    @Test
    public void hasSize(){
        assertEquals(55, tyre1.getSize());
    }

}
