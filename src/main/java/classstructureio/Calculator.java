package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Number A?");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println("Number B?");
        int B = scanner.nextInt();

        System.out.println(("Az összeg:") + (A + B) );
    }
}
