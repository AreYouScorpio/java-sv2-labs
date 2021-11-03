package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {


    Office office = new Office();

    public static void printMenu() {
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
    }

    public static int runMenu(){
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();
        //scanner.nextLine();
        if (menuChoice==8) {
            System.out.println("8");
        };if (menuChoice==9) {
            System.exit(0);
        };
        return menuChoice;
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        Office office = new Office();

        runMenu();
    }

}
