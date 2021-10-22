package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        int number;
        boolean okay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        number = scanner.nextInt();
        okay = number % 3 == 0 ;
        System.out.println("Osztható hárommal?" + "\n" + okay);
        System.out.println(okay ? "igen" : "nem");

    }

}
