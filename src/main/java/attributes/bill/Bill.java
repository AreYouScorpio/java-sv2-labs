package attributes.bill;

public class Bill {

    public static void main(String[] args) {

        BillItem billItem = new BillItem( "alma", 50,2,25);

        System.out.println(billItem.calculateTotalPrice()

        );
    }

}
