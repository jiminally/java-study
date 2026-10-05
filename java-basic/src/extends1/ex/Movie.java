package extends1.ex;

public class Movie extends Item{

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price); //부모 생성자 호출-> 부모 데이터 먼저 초기화
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
