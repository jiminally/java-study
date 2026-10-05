package casting;

public class Casting1 {
    static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue; //자바가 자동으로 해줌 작은거를 큰거에 넣을 때
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
