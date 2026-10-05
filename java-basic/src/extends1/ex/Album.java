package extends1.ex;

public class Album extends Item{

    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price); //부모 생성자 호출-> 부모 데이터 먼저 초기화
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
