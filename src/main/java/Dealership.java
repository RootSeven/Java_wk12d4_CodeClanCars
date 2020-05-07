import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carStock;
    private int till;

    public Dealership(int till) {
        this.till = till;
        this.carStock = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarStock() {
        return carStock;
    }

    public int getTill() {
        return till;
    }

    public void addCar(Car car) {
        this.carStock.add(car);
    }

    public void sellCar(Car car, Customer customer) {
        if (customer.getCash() >= car.getPrice()){
            customer.buyCar(car);
            this.carStock.remove(car);
            this.till += car.getPrice();
        }
    }

    public void buyCar(Car car, Customer customer) {
        if (this.till >= car.getPrice()){
            customer.sellCar(car);
            this.carStock.add(car);
            this.till -= car.getPrice();
        }
    }
}
