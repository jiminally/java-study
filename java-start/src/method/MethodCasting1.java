package method;

public class MethodCasting1 {

    static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); //더블을 인트에 대입하므로 컴파일 오류
        printNumber((int) number); // 명시적 형변환을 사용해 더블을 인트로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
