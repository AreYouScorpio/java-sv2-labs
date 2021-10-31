package chars;

import java.util.Scanner;

public class LettersAndDigits {

    public void printLetterOrDigits(String text) {
        int textLength = text.length();
        for (int i=0 ; i<textLength; i++){
            char character=text.charAt(i);
            if (Character.isAlphabetic(character))
            System.out.println(character + " - betű");
            if (Character.isDigit(character))
                System.out.println(character + " - szám");
            if (!((Character.isDigit(character)) || (Character.isAlphabetic(character))))
            System.out.println(character + " - egyéb");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        String text = scanner.nextLine();
        lettersAndDigits.printLetterOrDigits(text);


    }
}
