package access.ex;

public class ShoppingCartMain {

    static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2); //아이템 등록
        Item item2 = new Item("상추", 3000, 4); //아이템 등록

        cart.addItem(item1); //아이템 카트에 담기
        cart.addItem(item2); //아이템 카트에 담기

        cart.displayItems();
    }

}
