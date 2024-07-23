package tihs;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo(book1);
        Book book2 = new Book("Hello Java", "Seo");
        book1.displayInfo(book2);
        Book book3 = new Book("JPA", "kim", 700);
        book1.displayInfo(book3);
    }
}
