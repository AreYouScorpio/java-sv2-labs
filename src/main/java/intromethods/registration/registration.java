package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class registration {

    //String familyName;
    //String firstName;


    /* public String addNames( String familyName, String firstName) {
        return familyName+firstName;
    } */

    public static void main(String[] args) {


        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vezetéknév: ");
        String familyName = scanner.nextLine();
        System.out.println("Keresztnév: ");
        String firstName = scanner.nextLine();
        System.out.println("Email: ");

        String email = scanner.nextLine();

        System.out.println("Szül. nap: ");
        int day = scanner.nextInt();
        System.out.println("Szül. hónap: ");
        int month = scanner.nextInt();
        System.out.println("Szül. év: ");
        int year = scanner.nextInt();

        person.setName(addNames(firstName, familyName));
        person.setDateOfBirth(addDate(year,month,day));
        person.setEmail(email);



        System.out.println("Teljes név: " + person.getName());

        System.out.println("Email: " + person.getEmail());

        System.out.println("Dátum: " + person.getDateOfBirth());

        System.out.println("Felhasználó: " + person);
    }



    private static String addNames(String firstName, String familyName) {
        return firstName + " " + familyName;
    }
    private static LocalDate addDate(int year, int month, int day) {
         return LocalDate.of(year, month, day);
    }




}
