import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {

    private Dealership dealership1;
    private Car car1;
    private Customer customer1;
    private Customer customer2;
    private Tyre tyre1;
    private Engine engine1;

    @Before
    public void before() {
        dealership1 = new Dealership(1000000);
        engine1 = new Engine("petrol", "V8");
        tyre1 = new Tyre("Dunlop", "Winter", 55);
        car1 = new Car("Electric", engine1, tyre1, 10000, "blue", false);
        customer1 = new Customer(20000);
        customer2 = new Customer(20);
    }


    @Test
    public void hasTill() {
        assertEquals(1000000, dealership1.getTill());
    }

    @Test
    public void hasCarStock() {
        assertNotNull(dealership1.getCarStock());
    }

    @Test
    public void canAddCarToStock() {
        dealership1.addCar(car1);
        assertEquals(1, dealership1.getCarStock().size());
    }

    @Test
    public void canSellCar__sufficientFunds() {
        dealership1.addCar(car1);
        dealership1.sellCar(car1, customer1);

        assertEquals(0, dealership1.getCarStock().size());
        assertEquals(1, customer1.getOwnedCars().size());

        assertEquals(1010000, dealership1.getTill());
        assertEquals(10000, customer1.getCash());
    }

    @Test
    public void canSellCar__insufficientFunds() {
        dealership1.addCar(car1);
        dealership1.sellCar(car1, customer1);

        assertEquals(1, dealership1.getCarStock().size());
        assertEquals(0, customer1.getOwnedCars().size());

        assertEquals(1000000, dealership1.getTill());
        assertEquals(20, customer2.getCash());
    }

    @Test
    public void canBuyCar__sufficientFunds(){
        customer1.addCar(car1);
        dealership1.buyCar(car1, customer1);

        assertEquals(0, customer1.getOwnedCars().size());
        assertEquals(1, dealership1.getCarStock().size());

        assertEquals(30000, customer1.getCash());
        assertEquals(990000, dealership1.getTill());
    }

}