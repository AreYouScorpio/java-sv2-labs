package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {


    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sum = 0;
        for (int i=0; i<transactions.size(); i++){
            if (transactions.get(i).getTransactionOperation()==TransactionOperation.CREDIT)
            sum += transactions.get(i).getAmount();
        }
        return sum;
    }

}
