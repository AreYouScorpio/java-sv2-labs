package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {


        List<String> words = new ArrayList<>(Arrays.asList("alma", "korte", null, "cica"));
        try {

            for (String s : words) {
                System.out.println(s.charAt(0));
            }}
            catch(NullPointerException npe){
                System.out.println(npe.getMessage());
                System.out.println(npe.getMessage());
            }
        System.out.println(words.toString() + " END.");
    }

    }

    // ha null listaelem is van, nem all le hibával, hanem 2x kiírja

