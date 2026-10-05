package cond.ex;

public class FindEx {

    static void main(String[] args) {
        int x = 30;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
