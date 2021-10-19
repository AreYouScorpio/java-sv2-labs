package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "diesel", 4, 5);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hany szemelyes az auto? " );
        int persons = scanner.nextInt();
        car.setPersons(persons);
        scanner.nextLine();
        System.out.println("Hany ajtós az auto? " );
        int doors = scanner.nextInt();
        car.setDoors(doors);
        scanner.nextLine();
        System.out.println("Auto típusa? " );
        String carType = scanner.nextLine();
        car.setCarType(carType);
        System.out.println("Auto modellje? " );
        String modellName = scanner.nextLine();
        car.addModelName(modellName);
        System.out.println("Milyen a motorja? " );
        String engineType = scanner.nextLine();
        car.setEngineType(engineType);


        System.out.println("Az autód specifikációi: típus és modell: " + car.getCarType() + " motortípus: " + car.getEngineType() + " ülések száma: " + car.getPersons() + " ajtók száma: " + car.getDoors() );
    }
}
