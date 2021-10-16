package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Akos";
        client.year = 1977;
        client.address = "9082 Nyul, Iskola utca 3.";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Neved?");
        String name = scanner.nextLine();
        client.name = name;

        System.out.println("Címed?");
        String address = scanner.nextLine();
        client.address = address;

        System.out.println("Szül év?");
        int year = scanner.nextInt();
        client.year = year;



        System.out.println("szia, mi a neved?" + client.getName() + client.getYear() + client.getAddress());


    }
}



