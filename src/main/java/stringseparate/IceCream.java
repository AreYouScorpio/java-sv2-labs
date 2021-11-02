package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class IceCream {
    public static void main(String[] args) {

        List<String> icecreams = Arrays.asList("alma", "málna", "eper");

        for (int i = 0; i < icecreams.size(); i++) {
            System.out.print(icecreams.get(i)+", ");

        }

    }
}