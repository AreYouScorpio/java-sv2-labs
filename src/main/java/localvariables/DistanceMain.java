package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance (3.9, true);



        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int km = (int) (distance.getDistanceInKm());
        System.out.println(km);
    }

}

