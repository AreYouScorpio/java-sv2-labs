package classstructureintegrate;


import java.util.Scanner;

    public class Bank {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Szlaszam?");
            String accountNumber = scanner.nextLine();

            System.out.println("Tulaj?");
            String owner = scanner.nextLine();

            System.out.println("Egyenleg?");
            int amount = scanner.nextInt();
            scanner.nextLine();

            BankAccount account = new BankAccount(accountNumber, owner, amount);

            System.out.println(account.getInfo());

            System.out.println("Befiz.?");
            int depositAmount = scanner.nextInt();
            account.deposit(depositAmount);

            System.out.println(account.getInfo());

            System.out.println("Kivet?");
            int withdrawAmount = scanner.nextInt();
            account.withdraw(withdrawAmount);

            System.out.println(account.getInfo());
        }
    }

}
