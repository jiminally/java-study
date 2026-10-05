package array.Ex;

import java.util.Scanner;

public class ArrayEx4 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            sum += num;
        }

        double average = (double) sum / 5;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
