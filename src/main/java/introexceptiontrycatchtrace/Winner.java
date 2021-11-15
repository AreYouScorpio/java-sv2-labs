package introexceptiontrycatchtrace;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    List<String> names = new ArrayList<>(Arrays.asList("Peti", "Akos", "Mugli", null, "Barbi"));

    Random random = new Random();

    public List<String> getNames() {
        return names;
    }

    public String getWinner(){
        int r = random.nextInt(names.size())+1;
        System.out.println(names.get(r));
        String s = names.get(r).toString().toUpperCase();
        return s;
}
}
