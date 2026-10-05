package cond;

public class If6 {

    static void main(String[] args) {
        int age = 5;
        int price = 5000;
        int discount = 0;

        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000이상 구매, 1000원 할인");
        } else if(age <= 10) {
            discount = discount + 1000;
            System.out.println("1000 discount for chile");
        } else {
            System.out.println("no discount");
        }

        System.out.println("total discount is " + discount + "won");
    }
}
