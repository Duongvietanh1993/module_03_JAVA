package vehicle;

public class Car extends Vehicle{
    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
