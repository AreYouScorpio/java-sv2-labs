package probak;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    List<Passenger> passengers = new ArrayList<>();
    int maxCapa;

    public Plane(int maxCapa) {
        this.maxCapa = maxCapa;
    }

    boolean addPassenger(Passenger passenger){
        if (passengers.size()<maxCapa) {return passengers.add(passenger);} else {return false;}
    }

    public static void main(String[] args) {
        Plane plane = new Plane (1);
         Passenger passenger = new Passenger("Mugli", "AA", 4);
         Passenger passenger2 = new Passenger("Barbi", "AB", 3);

        plane.addPassenger(passenger);
        plane.addPassenger(passenger2);
        for (String j: passengers) {
            System.out.println(plane.passengers.get(j).getName().toString());
        }

    }

}
