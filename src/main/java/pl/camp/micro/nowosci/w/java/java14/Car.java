package pl.camp.micro.nowosci.w.java.java14;

public class Car {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Car() {
    }

    public String brand() {
        return this.brand;
    }

    public void brand(String brand) {
        this.brand = brand;
    }
}
