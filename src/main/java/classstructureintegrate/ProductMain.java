package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Termek neve? ");
        String name = scanner.nextLine();
        System.out.println("Termek ara? ");
        int price = scanner.nextInt();

        Product product = new Product(name,price);

        product.increasePrice(1);
        System.out.println(Product.getName() + Product.getPrice());
        product.decreasePrice(2);
        System.out.println(Product.getName() + product.getPrice());
    }


}
