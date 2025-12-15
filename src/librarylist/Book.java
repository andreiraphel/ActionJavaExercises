package librarylist;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isRented;
    
    public Book(String title, String author, int yearPublish) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublish;
        this.isRented = false;
        
        System.out.println(this.title + " " + this.author + " " + this.yearPublished);
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        this.isRented = true;
        System.out.println(this.title + " " + this.author + " " + this.yearPublished);
    }
    
    
    
}
