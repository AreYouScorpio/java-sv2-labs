package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Kedvenc film?");
        String movie = scanner.nextLine();
        favouriteThings.add(movie);

        System.out.println("Kedvenc színész?");
        String actor = scanner.nextLine();
        favouriteThings.add(actor);

        System.out.println("Kedvenc szín?");
        String colour = scanner.nextLine();
        favouriteThings.add(colour);

        System.out.println("Kedvenc állat?");
        String animal = scanner.nextLine();
        favouriteThings.add(animal);

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}