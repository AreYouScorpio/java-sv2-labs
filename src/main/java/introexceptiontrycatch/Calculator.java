package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A szam: ");
        int a = 0;
        try {
            a = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        System.out.println("B szam: ");
        int b = 0;
        try {
            b = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        System.out.println("Mi legyen a művelet? ");
        String task = scanner.nextLine();
        if (task.equals("+")) System.out.println(a+b);
        if (task.equals("-")) System.out.println(a-b);
        try {
            if (task.equals("/")) System.out.println(a / b);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
            if (task.equals("*")) System.out.println(a*b);
    }
}
