package loop;

public class While2_3 {

    static void main(String[] args) {
        int sum = 0;
        int i = 1; //while문 안에 생성하면 계속 생기기때문에 밖에다가
        int endNum = 10;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
