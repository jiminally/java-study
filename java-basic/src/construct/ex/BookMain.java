package construct.ex;

public class BookMain {
    static void main(String[] args) {
        //기본 생성자 생성
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java","Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA program","kim",700);
        book3.displayInfo();
    }
}
