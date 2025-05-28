public class IcCard {
    String number;
    int balance = 0;

    int add(int money) {
        balance = balance + money;
        return balance;
    }

    int subtract(int money) {
        balance = balance - money;
        return balance;
    }


    boolean pay (int money) {
//     付款金額必須小於等於餘額
//     付款金額不能為負
//     付款成功回傳 true
//     付款失敗回傳 false
        if (money <= balance && money > 0) {
            balance = balance - money;
            return true;
        } else {
            System.out.println("付款失敗");
            return false;
        }
    }


    void printInfo() {
        System.out.println("Card Number: " + number);
        System.out.println("Balance: " + balance);

    }
}
