package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        System.out.println("Egész szám:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 100) {
            System.out.println("100 v kisebb");
        } else {
            System.out.println("Nagyobb, mint 100");
        }
    }
}