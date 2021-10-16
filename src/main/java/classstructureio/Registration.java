package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void mai0n(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nev:");
        String Name = scanner.nextLine();
        System.out.println("Email cim:");
        String Email = scanner.nextLine();
        System.out.println("Regisztráltál a következő néven:" + Name);
        System.out.println("Regisztráltál a következő email címmel:" + Email);

    }
}
