package statements;

import java.util.Scanner;

public class IntvestmentMain {

    public static void main(String[] args) {
        Investment investment = new Investment(100, 3);
        Scanner scanner = new Scanner(System.in);

        investment.setFund(scanner.nextInt());
        investment.setInterestRate(scanner.nextInt());

        double cost = 0.003;


        System.out.println("Bef.összeg: " + investment.getFund());
        System.out.println("Kamatláb: "+ investment.getInterestRate());
        System.out.println("Hozam :" + investment.getYield(365));
        System.out.println("Ktg 0.003% :" + investment.getFund()*cost);

        System.out.println("Kivett összeg: " + investment.close());




    }
}
