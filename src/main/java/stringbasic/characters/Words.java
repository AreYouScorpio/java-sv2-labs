package stringbasic.characters;


import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Szó: ");
        String word = scanner.nextLine();
        System.out.println();

        System.out.println("A szó: " + word);
        System.out.println("Betűnként enter please!");

        char[] chars = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            String letter = scanner.nextLine();
            chars[i] = letter.toCharArray()[0];
        }

        System.out.println("A beírt betűk: " + Arrays.toString(chars));
        String result = new String(chars);
        System.out.println("A szó: " + result);

        if (result.equals(word)) {
            System.out.println("OK.");
        } else {
            System.out.println("Not OK.");
        }
    }
}

