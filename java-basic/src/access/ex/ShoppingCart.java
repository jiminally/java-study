package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //addItem()
    public void addItem(Item item) {
        //검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //실행 로직
        items[itemCount] = item;
        itemCount++;

    }

    //displayItems()
    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i]; //아이템 배열에서 아이템 차례로 꺼내자 -> 가독성
            System.out.println("상품명:" + item.getName() + ", 합계:" + (item.getTotalPrice()));
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i]; //가독성
            sum += item.getTotalPrice();
        }
        return sum;
    }
}
