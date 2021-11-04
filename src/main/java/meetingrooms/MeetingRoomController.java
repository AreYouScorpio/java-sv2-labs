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
            System.out.println("Az új teljes tárgyaló lista adatai (nevek): ");
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                System.out.println(Office.meetingRooms.get(i).getName());
                // System.out.println(Office.meetingRooms.get(i).getLength());
                // System.out.println(Office.meetingRooms.get(i).getWidth());
            }
        }

        if (menuChoice==3) {
            System.out.println("Az új teljes tárgyaló lista fordított sorrendben (nevek): ");
            for (int i = Office.meetingRooms.size(); i > 0; i--) {
                System.out.println(Office.meetingRooms.get(i-1).getName());
                // System.out.println(Office.meetingRooms.get(i-1).getLength());
                // System.out.println(Office.meetingRooms.get(i-1).getWidth());
            }
        }

        if (menuChoice==4) {
            System.out.println("Az új teljes tárgyaló lista minden második eleme (nevek): ");
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                if (i%2>0) {
                System.out.println(Office.meetingRooms.get(i).getName());
                // System.out.println(Office.meetingRooms.get(i).getLength());
                // System.out.println(Office.meetingRooms.get(i).getWidth());
            }}
        }

        if (menuChoice==5) {
            System.out.println("Az új teljes tárgyaló lista adatai névvel, méretekkel, területtel: ");
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                System.out.println("Név: " +Office.meetingRooms.get(i).getName());
                System.out.println("Hossz: " +Office.meetingRooms.get(i).getLength());
                System.out.println("Szélesség: "+Office.meetingRooms.get(i).getWidth());
                System.out.println("Terület: " + (Office.meetingRooms.get(i).getWidth()*Office.meetingRooms.get(i).getLength()) +" nm");
            }
        }

        if (menuChoice==6) {
            System.out.println("Adja meg a keresett tárgyaló pontos nevét: ");
            scanner.nextLine();
            String meetingRoomSearch = scanner.nextLine();
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                if (Office.meetingRooms.get(i).getName().equals(meetingRoomSearch)) {
                System.out.println("Név: " +Office.meetingRooms.get(i).getName());
                System.out.println("Hossz: " +Office.meetingRooms.get(i).getLength());
                System.out.println("Szélesség: "+Office.meetingRooms.get(i).getWidth());
                System.out.println("Terület: " + (Office.meetingRooms.get(i).getWidth()*Office.meetingRooms.get(i).getLength()) +" nm");
            }}
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
