package pl.sda.ex26;

public class Car {
    public String name;
    public String description;
    public CarTypeEnum carType;

    public Car (String name, String description, CarTypeEnum carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }
}
