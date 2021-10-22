package statements;

public class Investment {
    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active = true;
    private double yield;

    public Investment(int fund, int interestRate)
    { this.fund = fund;
        this.interestRate = interestRate;
    };

    public int getFund() {
        return fund;
    }
    public int getInterestRate() {
        return interestRate;
    }
    public void setFund(int fund)
    {this.fund=fund;}
    public void setInterestRate(int interestRate)
    {this.interestRate=interestRate;}

    public double getYield(int days) {

        return days/365*this.interestRate/100.0*this.fund;

    }

    public double close(int days) {
        
        double total = this.getFund() - this.cost*this.getFund() + this.getYield(days);
        double payment = active ? total : 0 ;
        this.active = false;
        return payment;
    }


}
