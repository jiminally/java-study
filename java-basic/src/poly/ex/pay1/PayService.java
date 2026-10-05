package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result;
        System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);


        Payment payment;

        if (option.equals("kakao")) {
            Payment payment = new KakaoPay();
            result = payment.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) {
            System.out.println("결제를 성공했습니다.");
        } else {
            System.out.println("결제를 실패했습니다.");
        }
    }
}
