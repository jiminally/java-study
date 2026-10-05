package method;

public class MethodValue3 {
    static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, number: " + num1);
        num1 = changNumber(num1); //10
        System.out.println("changeNumber 호출 후, number: " + num1);

    }

    public static int changNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
