package cond;

public class If5 {

    static void main(String[] args) {
        int age = 10;
        int price = 12000;
        int discount = 0;

        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000이상 구매, 1000원 할인");
        }

        if(age <= 10) {
            discount = discount + 1000;
            System.out.println("1000 discount for chile");
        }

        System.out.println("total discount is " + discount + "won");
    }
}
