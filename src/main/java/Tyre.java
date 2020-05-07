public class Tyre {

    private String brand;
    private String tyreType;
    private int size;

    public Tyre(String brand, String tyreType, int size) {
        this.brand = brand;
        this.tyreType = tyreType;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getTyreType() {
        return tyreType;
    }

    public int getSize() {
        return size;
    }
}
