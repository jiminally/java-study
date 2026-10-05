package array.Ex;

import java.util.Scanner;

public class ArrayEx6 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = input.nextInt();
        int[] array = new int[count];
        int minNumber, maxNumber;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }

        // 작은 수 큰 수 찾기
        minNumber = maxNumber = array[0];
        for (int i = 1; i < count; i++) {
            if (array[i] < minNumber) {
               minNumber = array[i];
            }
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
