package casting;

public class Casting3 {

    static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L; //int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); //-2147483648 int의 제일 작은 값부터 다시 시작 오버플로우
    }
}
