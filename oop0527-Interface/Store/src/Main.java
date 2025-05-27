public class Main {
  public static void main(String[] args) {

    Payment linePay = new LinePay();
    Order order1 = new Order(linePay, 100);
    order1.processOrder();

    System.out.println("---------------------");

    ApplePay applePay = new ApplePay();
    Order order2 = new Order(applePay, 200);
    order2.processOrder();

  }
}