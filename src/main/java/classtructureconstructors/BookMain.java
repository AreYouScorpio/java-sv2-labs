package classtructureconstructors;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class BookMain {


    public static void main(String[] args) {
        Book book = new Book("Akos", "Az orokelet titka");
        book.register("777");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());

    }

}
