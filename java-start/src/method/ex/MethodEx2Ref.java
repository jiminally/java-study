package method.ex;

public class MethodEx2Ref {

    static void main(String[] args) {
        printString("Hello, world",3);
        printString("Hello, world",5);
        printString("Hello, world",7);

    }

    public static void printString(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
