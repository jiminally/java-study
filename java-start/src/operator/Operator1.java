package operator;

public class Operator1 {

    static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);

    }
}
