package nested.test;

public class Library {

    private Book[] books;
    private int count;

    public Library(int maxSize) {
        books = new Book[maxSize];
        count = 0;
    }

    public void addBook(String title, String author) {
        //검증 로직을 다 처리하고
        if (count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[count] = new Book(title, author);
        count++;

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

}
