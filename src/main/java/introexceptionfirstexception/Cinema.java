package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vasarlo neve: ");
        String name = scanner.nextLine();
        System.out.println("Film cime: ");
        String title = scanner.nextLine();
        System.out.println("Hany jegyet szeretne? ");
        int ticketsnumber = scanner.nextInt();
        System.out.println(name);
        System.out.println(title);
        for (int i = 0; i < ticketsnumber; i++) {
            System.out.println("Lefoglalt jegyek: 1. sor " + (i+1) + ". szék");
        }
    }
}
