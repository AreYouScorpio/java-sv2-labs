package meetingrooms;

import java.util.Locale;
import java.util.Scanner;

import static meetingrooms.Office.*;


public class MeetingRoomController<menuChoice> {


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
        int menuChoice=10;

        Scanner scanner = new Scanner(System.in);
        String menuChoiceAlphanumeric = scanner.nextLine();


        // ez a rész csak azért van, hogy a menüben 1-9 fogadjon csak el számot

        int textLength = menuChoiceAlphanumeric.length();
        //for (int i=0 ; i<textLength; i++) {
        if (textLength>1) {
            System.out.println("Egy számot adjon csak meg !");
            menuChoice = 10;
        } else {;
            char character = menuChoiceAlphanumeric.charAt(0);
            if (!Character.isDigit(character)) {
                System.out.println("Kérem számot adjon meg!");
                menuChoice=10;}
            if (Character.isDigit(character)) {
                int number = Character.getNumericValue(character);
                if (number>9 || number<1) {
                    System.out.println("Kérem 1-9 adjon meg számot!");
                    menuChoice = 10;
                } else {
                menuChoice = number;}

        }
    }

        // ez a rész csak azért volt, hogy a menüben 1-9 fogadjon csak el számot





        if (menuChoice==1) {
            System.out.println("1");
            readOffice();

        }

        if (menuChoice==2) {

            printNames();

        }

        if (menuChoice==3) {

            printNamesReverse();

        }

        if (menuChoice==4) {

            printEvenNames();

        }

        if (menuChoice==5) {

            printAreas();

        }

        if (menuChoice==6) {

            System.out.println("Adja meg a keresett tárgyaló pontos nevét: ");
            String name = scanner.nextLine();

            printMeetingRoomsWithName(name);

        }

        if (menuChoice==7) {
            System.out.println("Adja meg a keresett tárgyaló névrészletét: ");
            // scanner.nextLine();
            String meetingRoomTextSearch = scanner.nextLine();
            for (int i = 0; i < meetingRooms.size(); i++) {
                String lowCaseRoom = meetingRooms.get(i).getName().toLowerCase();
                if (lowCaseRoom.indexOf(meetingRoomTextSearch.toLowerCase())>=0) {
                System.out.println("Név: " + meetingRooms.get(i).getName());
                System.out.println("Hossz: " + meetingRooms.get(i).getLength());
                System.out.println("Szélesség: "+ meetingRooms.get(i).getWidth());
                System.out.println("Terület: " + (meetingRooms.get(i).getWidth()* meetingRooms.get(i).getLength()) +" nm");
            }}
        }

        if (menuChoice==8) {
            System.out.println("Adja meg a keresett tárgyaló területét (nm): ");
            // scanner.nextLine();
            int meetingRoomQMSearch = scanner.nextInt();
            for (int i = 0; i < meetingRooms.size(); i++) {
                if ((meetingRooms.get(i).getWidth()* meetingRooms.get(i).getLength())>meetingRoomQMSearch) {
                    System.out.println("Név: " + meetingRooms.get(i).getName());
                    System.out.println("Hossz: " + meetingRooms.get(i).getLength());
                    System.out.println("Szélesség: "+ meetingRooms.get(i).getWidth());
                    System.out.println("Terület: " + (meetingRooms.get(i).getWidth()* meetingRooms.get(i).getLength()) +" nm");
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
