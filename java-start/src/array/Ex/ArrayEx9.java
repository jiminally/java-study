package array.Ex;

import java.util.Scanner;

public class ArrayEx9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 2;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); //개행 문자 제거용

            if (menu == 1) {
                // 상품을 더 등록할 수 없는 경우
                if (productCount >= maxProduct) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                // 상품 등록
                System.out.print("상품의 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                // 등록된 상품이 없는 경우
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                // 상품 목록 출력
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }

            } else if (menu == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴 번호를 입력했습니다.");
            }

        }

    }
}
