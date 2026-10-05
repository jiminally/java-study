package array.Ex;

import java.util.Scanner;

public class ArrayEx8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = input.nextInt();

        int[][] scores = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};

        // 학생들 점수 채우기
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = input.nextInt();
            }
        }

        // 점수 계산
        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
