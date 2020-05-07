public class Car {

    private Engine engine;
    private Tyre tyre;
    private int price;
    private String colour;
    private boolean isDamaged;
    private String carType;

    public Car(String carType, Engine engine, Tyre tyre, int price, String colour, boolean isDamaged) {
        this.carType = carType;
        this.engine = engine;
        this.tyre = tyre;
        this.price = price;
        this.colour = colour;
        this.isDamaged = isDamaged;
    }

    public String getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void damage() {
        if (this.isDamaged == false){
            this.isDamaged = true;
            this.price -= 2000;
        }
    }
}
