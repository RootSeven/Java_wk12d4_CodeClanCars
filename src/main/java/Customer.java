import java.util.ArrayList;

public class Customer {

    private ArrayList<Car> ownedCars;
    private int cash;

    public Customer(int cash) {
        this.ownedCars = new ArrayList<Car>();
        this.cash = cash;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public int getCash() {
        return cash;
    }

    public void buyCar(Car car) {
        this.cash -= car.getPrice();
        this.ownedCars.add(car);
    }

    public void addCar(Car car) {
        this.ownedCars.add(car);
    }

    public void sellCar(Car car) {
        this.ownedCars.remove(car);
        this.cash += car.getPrice();
    }
}
