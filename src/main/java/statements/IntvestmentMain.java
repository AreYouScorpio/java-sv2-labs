package statements;

import java.util.Scanner;

public class IntvestmentMain {

    public static void main(String[] args) {
        Investment investment = new Investment(100, 3);
        Scanner scanner = new Scanner(System.in);

        investment.setFund(scanner.nextInt());
        investment.setInterestRate(scanner.nextInt());

        System.out.println(investment.getYield(180));
        System.out.println(investment.Close());




    }
}
