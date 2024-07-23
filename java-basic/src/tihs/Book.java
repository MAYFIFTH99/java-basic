package tihs;

public class Book {
    String title;
    String author;
    int page;


    public Book() {
        this(", ",", ", 0);
    }

    public Book(String title, String author) {
        this(title,author,0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(Book book) {
        System.out.println(book.title + book.author + book.page);
    }
}
