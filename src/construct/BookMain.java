package construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.dispalyInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.dispalyInfo();

        Book book3 = new Book("JPA", "kim",700);
        book3.dispalyInfo();
    }
}
