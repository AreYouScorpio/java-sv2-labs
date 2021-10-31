package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> bookTitles = new ArrayList<>();

    public Books() {
        this.bookTitles = bookTitles;
    }

    public void addBook (String title) {
        bookTitles.add(title);  
    };
    
    public void findBookAndSetAuthor(String title, String author){
        if(bookTitles.contains(title)){
        int index = bookTitles.lastIndexOf(title);
            System.out.println("A könyv megtalálható, a helye: " + (index+1));
            System.out.println(bookTitles.get(index));
        String fullData = bookTitles.get(index).toString()+" "+author;
            System.out.println(fullData);
            bookTitles.set(index, fullData);

        }
        else {
            System.out.println("Nincs ilyen cím.");
        };

    }

    public List<String> getBookTitles() {
        return bookTitles;
    }
}
