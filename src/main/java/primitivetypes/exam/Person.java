package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    String name;
    LocalDate born;
    int postalCode;
    double averageResult;

    public Person(String name, LocalDate born, int postalCode, double averageResult) {
        this.name = name;
        this.born = born;
        this.postalCode = postalCode;
        this.averageResult = averageResult;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public double getAverageResult() {
        return averageResult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", postalCode=" + postalCode +
                ", averageResult=" + averageResult +
                '}';
    }

}
