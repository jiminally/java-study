package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //생성자 만들 수 있음
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //메서드 만들 수 있음
    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
