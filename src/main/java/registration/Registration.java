package registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("User name? ");
        String username2 = scanner.nextLine();
        System.out.println("Password? ");
        String password1 = scanner.nextLine();
        System.out.println("Password again? ");
        String password2 = scanner.nextLine();
        System.out.println("Email? ");
        String email = scanner.nextLine();
        boolean passwordcheck;
        passwordcheck = password1.equals(password2);

        UserValidator userValidator = new UserValidator();
        System.out.println("Username OK?" + userValidator.isValidUsername(username2));
        System.out.println("Password1 OK? " + userValidator.isValidPassword(password1));
        System.out.println("Password2 OK? " + userValidator.isValidPassword(password2));
        System.out.println("Passwords are the same? " + passwordcheck);
        System.out.println("Email OK?" + userValidator.isValidEmail(email));



    }
}
