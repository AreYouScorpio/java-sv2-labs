package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {


    // Office office = new Office();

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

    public static Office readOffice(){

        Office newOffice = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új tárgyaló");
        System.out.println("Kérem a tárgyaló nevét: ");
        String nameNewOffice = scanner.nextLine();
        System.out.println("Kérem a tárgyaló méreteit - hossza: ");
        int lengthNewOffice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a tárgyaló méreteit - szélessége: ");
        int widthNewOffice = scanner.nextInt();
        scanner.nextLine();
        newOffice.addMeetingRoom(nameNewOffice, lengthNewOffice, widthNewOffice);
        return newOffice;
    }



    public static void runMenu(){
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();


        if (menuChoice==1) {
            System.out.println("1");
            readOffice();


        }

        if (menuChoice==2) {
            System.out.println("Az új teljes tárgyaló lista adatai: ");
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                System.out.println(Office.meetingRooms.get(i).getName());
                System.out.println(Office.meetingRooms.get(i).getLength());
                System.out.println(Office.meetingRooms.get(i).getWidth());
            }
        }


        if (menuChoice==9) {
            System.out.println("9");
            System.exit(0);
        };


        return;
    }



    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        Office office = new Office();
        while(true) runMenu();
    }

}
