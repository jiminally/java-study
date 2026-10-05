package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력하세요: ");
        String str = scanner.nextLine();

        while (!str.equals("exit")) {
            System.out.println(str);
            System.out.print("문자를 입력하세요: ");
            str = scanner.nextLine();

        }
    }
}
