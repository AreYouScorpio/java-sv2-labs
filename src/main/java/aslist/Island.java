package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {
        Island island = new Island();
        Scanner scanner = new Scanner(System.in);
        List<String> importantThings = Arrays.asList("alma", "körte", "cigi");

        System.out.println("3 dolgot vihetsz:");
        System.out.println("Válaszaid: " + importantThings);
        System.out.println();
        System.out.println("Változtatsz:");
        System.out.println("Hányadik elemet cseréljük le:");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Mire cseréljük?");
        String thing = scanner.nextLine();
        importantThings.set(index, thing);
        System.out.println("Ezeket viszed:");
        System.out.println(importantThings);
    }
}