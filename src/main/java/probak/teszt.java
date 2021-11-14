package probak;

import java.util.Scanner;

public class teszt {
    public static void main(String[] args) {
        System.out.println("A hét napja? ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day){
            case "Hetfo":
                System.out.println("het eleje van");
                break;
            case "Kedd":
            case "Szerda":
            case "Csutortok":
                System.out.println("Het kozepe van");
                break;
            case "Pentek":
                System.out.println("Utolsó munkanap van");
                break;
            case "Szombat":
            case "VAsarnap":
                System.out.println("Hetvege van");
                break;
            default:
                System.out.println("Ismertelen nap");
        }

    }

}
