package array.Ex;

import java.util.Scanner;

public class ArrayEx2 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < array.length; i++) {
            int num = input.nextInt();
            array[i] = num;
            // 둘이 합칠수 있다
            // array[i] = input.nextInt();
        }
        System.out.println("출력");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
