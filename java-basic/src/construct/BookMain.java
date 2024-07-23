package construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Hello", "seo");
        Book book3 = new Book("jpa", "kim", 89);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
