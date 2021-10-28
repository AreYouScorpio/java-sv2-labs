package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    String description;
    LocalDate startTime;
    int numberOfPeople;
    double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public int registerPerson(int person){
        return numberOfPeople = numberOfPeople + person;
    }

    public double ride(double km){
        return kms = kms + km;
    }


    public static void main(String[] args) {

        LocalDate initStartTime = LocalDate.of(2021,9,1);
        CyclingTour cyclingTour = new CyclingTour("Ausztria", initStartTime);
        System.out.println("Túra helye: " + cyclingTour.getDescription() +"\n"+ "Résztevők száma: " + cyclingTour.getNumberOfPeople() +"\n"+ "Összes megtett km: " + cyclingTour.getKms() +"\n"+ "Túra dátuma: " + cyclingTour.getStartTime());

        cyclingTour.registerPerson(5);
        cyclingTour.ride(100);
        System.out.println("Túra helye: " + cyclingTour.getDescription() +"\n"+ "Résztevők száma: " + cyclingTour.getNumberOfPeople() +"\n"+ "Összes megtett km: " + cyclingTour.getKms() +"\n"+ "Túra dátuma: " + cyclingTour.getStartTime());


    }


}
