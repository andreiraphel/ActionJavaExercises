package librarylist;

import java.util.*;

public class BookRental {
    static ArrayList<Book> library = new ArrayList<Book>();

    void addBooks(Book book) {
        library.add(book);
    }
    
    void rentBooks(Book book) {
        book.isRented();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
