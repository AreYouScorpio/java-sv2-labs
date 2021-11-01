package enumtype;


import java.util.Arrays;

public class firtsEnumMain {
    public static void main(String[] args) {


        for (firstenum.Continent i : firstenum.Continent.values()) {
            System.out.println(i);
        }

        String continents[] = new String[6];



        for (int i=0 ; i<6; i++) {

            continents[i]=firstenum.Continent.values()[i].toString();
        }

        System.out.println(Arrays.deepToString(continents));
        }
    }

