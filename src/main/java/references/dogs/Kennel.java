package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {


        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Alma", 3, "black");
        Dog dog2 = new Dog("Bonjour", 4, "green");
        Dog dog3 = new Dog("Christ", 5, "yellow");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog1.colour = "blue";
        dog1.setColour("blueblue");
        System.out.println(dogs);
        Dog dog5 = new Dog("DickDog", 6, "zőőőd");
        System.out.println(dog5);
        System.out.println(dogs);

        dog5 = dog1;
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.colour="blaw";

        System.out.println(dogs);

        List<Dog> dogs2= new ArrayList<>();
        dogs2 = dogs;

        Dog dog7 = dog4;
        dog7.colour="vaúszín";
        System.out.println(dog7);

        System.out.println(dogs2);

        dog2.colour="ejnyeszín";
        System.out.println(dogs2);

        dog2=null;
        System.out.println(dogs2);



        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.colour="hófekete";
        System.out.println(dogs2);




    }
}
