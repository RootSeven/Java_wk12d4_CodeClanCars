import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EngineTest {

    private Engine engine1;

    @Before
    public void before(){
        engine1 = new Engine( "petrol", "V8" );
    }

    @Test
    public void hasFuel(){
        assertEquals("petrol", engine1.getFuel());
    }

    @Test
    public void hasEngineType(){
        assertEquals("V8", engine1.getEngineType());
    }

}
