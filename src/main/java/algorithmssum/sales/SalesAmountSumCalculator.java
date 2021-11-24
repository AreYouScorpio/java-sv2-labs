package algorithmssum.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount (List < Salesperson > salespeople) {
        int sum = 0;
        for (int i=0; i<salespeople.size(); i++) {

            sum += salespeople.get(i).getAmount();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Salesperson> salespeople = new ArrayList<>();
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();


        Salesperson salesperson = new Salesperson("Jack", 1500);
        //Salesperson salesperson2 = new Salesperson("Bkos", 300);
        salespeople.add(salesperson);
        // salespeople.add(salesperson2);

        System.out.println(salesAmountSumCalculator.sumSalesAmount(salespeople));


    }
}
