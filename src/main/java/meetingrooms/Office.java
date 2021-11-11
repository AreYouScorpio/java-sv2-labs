package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    public static List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int length, int width){

        MeetingRoom newOffice = new MeetingRoom(name, length, width);

        meetingRooms.add(newOffice);


        System.out.println("Az új tárgyaló hozzáadva. Adatai: " + newOffice.getName() + " " + newOffice.getLength() + " " + newOffice.getWidth());


            ;

    }

    public static void printNames() {

        System.out.println("Az új teljes tárgyaló lista adatai (nevek): ");
        for (int i = 0; i < Office.meetingRooms.size(); i++) {
            System.out.println(Office.meetingRooms.get(i).getName());

            /*
            System.out.println("Az új teljes tárgyaló lista adatai (nevek): ");
            for (int i = 0; i < Office.meetingRooms.size(); i++) {
                System.out.println(Office.meetingRooms.get(i).getName());
                // System.out.println(Office.meetingRooms.get(i).getLength());
                // System.out.println(Office.meetingRooms.get(i).getWidth());
            }*/
        }


    }

    public static void printNamesReverse() {

            System.out.println("Az új teljes tárgyaló lista fordított sorrendben (nevek): ");
            for (int i = Office.meetingRooms.size(); i > 0; i--) {
                System.out.println(Office.meetingRooms.get(i-1).getName());
                // System.out.println(Office.meetingRooms.get(i-1).getLength());
                // System.out.println(Office.meetingRooms.get(i-1).getWidth());
            }
        }



    public static void printEvenNames() {

        System.out.println("Az új teljes tárgyaló lista minden második eleme (nevek): ");
        for (int i = 0; i < Office.meetingRooms.size(); i++) {
            if (i % 2 > 0) {
                System.out.println(Office.meetingRooms.get(i).getName());
                // System.out.println(Office.meetingRooms.get(i).getLength());
                // System.out.println(Office.meetingRooms.get(i).getWidth());
            }
        }
    }

    public static void printAreas() {
        System.out.println("Az új teljes tárgyaló lista adatai névvel, méretekkel, területtel: ");
        for (int i = 0; i < Office.meetingRooms.size(); i++) {
            System.out.println("Név: " + Office.meetingRooms.get(i).getName());
            System.out.println("Hossz: " + Office.meetingRooms.get(i).getLength());
            System.out.println("Szélesség: " + Office.meetingRooms.get(i).getWidth());
            System.out.println("Terület: " + (Office.meetingRooms.get(i).getWidth() * Office.meetingRooms.get(i).getLength()) + " nm");
        }
    }


    public static void printMeetingRoomsWithName() {

        System.out.println("Adja meg a keresett tárgyaló pontos nevét: ");
        //scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = 0; i < Office.meetingRooms.size(); i++) {
            if (Office.meetingRooms.get(i).getName().equals(name)) {
                System.out.println("Név: " + Office.meetingRooms.get(i).getName());
                System.out.println("Hossz: " + Office.meetingRooms.get(i).getLength());
                System.out.println("Szélesség: " + Office.meetingRooms.get(i).getWidth());
                System.out.println("Terület: " + (Office.meetingRooms.get(i).getWidth() * Office.meetingRooms.get(i).getLength()) + " nm");
            }
        }
    }


    }

