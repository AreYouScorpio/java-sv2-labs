package introexceptionthrow;


import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj egy + számot: ");
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();
        for (int j = 0; j<chars.length; j++) {
            if (!Character.isDigit(chars[j])) {
                throw new IllegalArgumentException("Pozitív számot kérek !!! ");
            }

        }
    }


}
