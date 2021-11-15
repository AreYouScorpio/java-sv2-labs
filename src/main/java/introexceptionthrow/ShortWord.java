package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        System.out.println("Adj meg egy 1-5 betus szot/karakterláncot: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.length()>5 || word.length()<1)
        {throw new IllegalArgumentException("háhá, nem 1-5 betűs a karakterlánc, háhá");}
    }
}
