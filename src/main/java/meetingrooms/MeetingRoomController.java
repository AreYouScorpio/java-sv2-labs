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

    public int runMenu(){
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();
        return menuChoice;
    }

    public static void main(String[] args) {
        printMenu();


    }

}
