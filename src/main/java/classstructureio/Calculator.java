package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Number A?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Number B?");
        int b = scanner.nextInt();

        System.out.println(("Az összeg:") + (a + b) );


    }
}
