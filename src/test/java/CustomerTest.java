import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    private Customer customer1;
    private Customer customer2;

    private Car car1;
    private Engine engine1;
    private Tyre tyre1;

    @Before
    public void before(){
        customer1 = new Customer(20000);
        customer2 = new Customer(10);

        car1 = new Car("Electric", engine1, tyre1, 10000, "blue", false);
        engine1 = new Engine( "petrol", "V8" );
        tyre1 = new Tyre("Dunlop", "Winter", 55);
    }

    @Test
    public void hasCash(){
        assertEquals(20000, customer1.getCash());
    }

    @Test
    public void hasOwnedCars(){
        assertNotNull(customer1.getOwnedCars());
    }

    @Test
    public void canBuyCar__enoughCash(){
        customer1.buyCar(car1);
        assertEquals(1, customer1.getOwnedCars().size());
        assertEquals(10000, customer1.getCash());
    }

    @Test
    public void canAddCar(){
        customer1.addCar(car1);
        assertEquals(1, customer1.getOwnedCars().size());
    }

    @Test
    public void canSellCar(){
        customer1.addCar(car1);
        customer1.sellCar(car1);
        assertEquals(0, customer1.getOwnedCars().size());
        assertEquals(30000, customer1.getCash());
    }

}
