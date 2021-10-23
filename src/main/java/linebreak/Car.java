package linebreak;

public class Car {
    public String brand;
    public String type;
    public String getBrandAndTypeInSeparateLines(String brand, String type)
    {
        return brand + "\n" + type;
    }

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.getBrandAndTypeInSeparateLines("BMW", "3er Cabriolet"));

    }
}
