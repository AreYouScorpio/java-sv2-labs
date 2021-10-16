package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Akos");
        client.setYear(1977);
        client.setAddress("9082 Nyul, Iskola utca 3.");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Neved?");
        String name = scanner.nextLine();
        client.setName(name);

        System.out.println("Címed?");
        String address = scanner.nextLine();
        client.setAddress(address);

        System.out.println("Szül év?");
        int year = scanner.nextInt();
        client.setYear(year);



        System.out.println("Adat:" + client.getName() + client.getYear() + client.getAddress());

        client.migrate("Gyor, Kassak L. u. 13.");
        System.out.println("Uj cim (elkoltozott ) :" + client.getAddress());


    }
}
