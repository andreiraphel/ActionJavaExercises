package librarylist;

import java.util.*;

public class BookRental {
    static ArrayList<Book> library = new ArrayList<Book>();

    static void addBooks(Book book) {
        library.add(book);
    }
    
    static void rentBooks(Book book) {
        book.rent();
    }
    
    public static void clearLibrary() {
        library.clear();
    }
    
    public static int getLibrarySize() {
        return library.size();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        addBooks(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        addBooks(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
        addBooks(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
        addBooks(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
        
        rentBooks(library.get(0));
        rentBooks(library.get(1));
        
    }

}
