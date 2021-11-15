package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {

        Change change = new Change();
        int[] newArray = change.changeNumbers();
        System.out.println(Arrays.toString(newArray));

    }
}


// RandomOp osztály-ban a tömb hosszt kellett 1-gyel csökkenteni, h ne legyen nagyobb indexű, mint a tömb hossza