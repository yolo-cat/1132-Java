public class MyPrinter {

    void printValue(int num) {
        System.out.println("Value: " + num);
    }

    void printIcCard(IcCard card) {
        card.balance += 10;
        card.printInfo();
    }
}
