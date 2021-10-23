package registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username2 = scanner.nextLine();
        UserValidator userValidator = new UserValidator();
        System.out.println(userValidator.isValidUsername(username2));
    }
}
