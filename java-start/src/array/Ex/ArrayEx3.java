package array.Ex;

import java.util.Scanner;

public class ArrayEx3 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            array[i] = num;
            // 둘이 합칠수 있다
            // array[i] = input.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력: ");

        for (int i = 4; i >= 0; i--) {
            System.out.print(array[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
