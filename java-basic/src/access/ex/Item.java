package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    //생성자 초기화
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //이름 받기
    public String getName() {
        return name;
    }

    //총 금액 받기
    public int getTotalPrice() {
        return price * quantity;
    }
}
