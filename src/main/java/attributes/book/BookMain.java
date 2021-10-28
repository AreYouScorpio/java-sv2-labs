package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        System.out.println(book.getTitle());
        book.setTitle("szia");
        System.out.println(book.getTitle());

    }


}
