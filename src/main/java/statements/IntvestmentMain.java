package statements;

import java.util.Scanner;

public class IntvestmentMain {

    public static void main(String[] args) {
        Investment investment = new Investment(100, 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fund: ");
        investment.setFund(scanner.nextInt());
        System.out.println("Interest rate: ");
        investment.setInterestRate(scanner.nextInt());



        System.out.println("Bef.összeg: " + investment.getFund());
        System.out.println("Kamatláb: "+ investment.getInterestRate());
        System.out.println("Hozam 365 napra:" + investment.getYield(365));
        System.out.println("Hozam 70 napra:" + investment.getYield(70));
        System.out.println("Ktg 0.003% :" + investment.getFund()*investment.cost);

        System.out.println("Kivett összeg 70 nap után: " + investment.close(70));
        System.out.println("Kivett összeg 365 nap után (ha már kivettük korábban és close-oltuk ): " + investment.close(365));





    }
}
