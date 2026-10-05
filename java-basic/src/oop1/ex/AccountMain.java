package oop1.ex;

public class AccountMain {
    static void main(String[] args) {
        Account atm = new Account();

        atm.deposit(10000);
        atm.withdraw(9000);
        atm.withdraw(2000); //잔액 부족

        System.out.println("잔고: " + atm.balance);
    }
}
