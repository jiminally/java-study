package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;

        System.out.print("첫번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환한다.
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2= temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        while (true) {
            System.out.print(num1);

            if (num1 == num2) {
                break;
            }

            System.out.print(" ,");
            num1++;
        }

    }
}
