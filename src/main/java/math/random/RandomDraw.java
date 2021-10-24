package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("Kiss Nagy Peti");
        persons.add("Nagy Kis Béla");
        persons.add("Nagy Gizike");
        persons.add("Csúnya Luca");
        persons.add("Ezüst Áron");
        persons.add("Arany Áron");
        persons.add("Alul Áron");
        persons.add("Felül Áron");
        persons.add("Bármi Áron");
        persons.add("Semmi Áron");

        Random random = new Random();
        int firstIndex = random.nextInt(5);
        int secondIndex = random.nextInt(5) + 5;

        System.out.println(persons.get(firstIndex));
        System.out.println(persons.get(secondIndex));
    }
}