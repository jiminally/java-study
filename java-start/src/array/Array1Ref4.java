package array;

public class Array1Ref4 {

    static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화 더 간략하게 단 선언과 초기화를 나눠서쓰면 안됨

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }
}
