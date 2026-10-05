package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0을 입력하면 프로그램 종료");
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("사용자가 입력한 모든 정수의 합: " + sum);


    }
}
