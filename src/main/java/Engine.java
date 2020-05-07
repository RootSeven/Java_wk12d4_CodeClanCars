public class Engine {

    private String fuel;
    private String engineType;

    public Engine(String fuel, String engineType) {
        this.fuel = fuel;
        this.engineType = engineType;
    }

    public String getFuel() {
        return fuel;
    }

    public String getEngineType() {
        return engineType;
    }
}
