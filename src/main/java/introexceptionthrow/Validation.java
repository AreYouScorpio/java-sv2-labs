package introexceptionthrow;

import java.util.Scanner;

public class Validation {

    public void validateName(String name){
        if (name==null || name.length()==0) {throw new IllegalArgumentException("Hahó, üres név nem lehet!");
    }
    }

    public void validateAge(String age) {
        if (Integer.parseInt(age) < 0 || Integer.parseInt(age) > 120) {
            throw new IllegalArgumentException("nem is ember =:-o");
        }
        if (age == null || age.length() == 0) {
            throw new IllegalArgumentException("Ez nem tartalmaz semmit.");
        }

        char[] ageChars = age.toCharArray();
        for (char a : ageChars) {
            if (!Character.isDigit(a)) {
                throw new IllegalArgumentException("Nem szám!");
            }
        }
    }

}
