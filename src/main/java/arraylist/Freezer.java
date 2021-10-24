package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> frozenThings = new ArrayList<>();
        frozenThings.add("kenyér");
        frozenThings.add("tej");
        frozenThings.add("alma");
        frozenThings.add("paprika");
        frozenThings.add("málna");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());

        frozenThings.remove("tej");
        frozenThings.remove("paprika");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());
    }
}