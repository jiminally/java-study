package extends1.ex;

public class Book extends Item{

    private String author;
    private String isbn;

    //자식 클래스 생성자
    public Book(String name, int price, String author, String isbn) {
        super(name, price); //부모 생성자 호출-> 부모 데이터 먼저 초기화
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
