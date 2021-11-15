package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Mi a neved? ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        System.out.println("Korod? ");
        try{
        String ageString = scanner.nextLine();
        validation.validateAge(ageString);}
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }



    }

}
