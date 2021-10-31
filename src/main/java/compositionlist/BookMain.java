package compositionlist;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Books books = new Books ();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány könyvet szeretnél tárolni? ");
        int piece= scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<piece; i++) {
            System.out.println("Adj meg egy könyvcímet: ");
            String title = scanner.nextLine();
            System.out.println("Adj meg egy szerzőt: ");
            String author = scanner.nextLine();

            books.bookTitles.add(title);
        }

        System.out.println("Keresett könyv címe? ");
        String titleSearch = scanner.nextLine();
        System.out.println("Keresett könyv szerzője? ");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(titleSearch, author);
        System.out.println(books.getBookTitles().toString());





    }
}
