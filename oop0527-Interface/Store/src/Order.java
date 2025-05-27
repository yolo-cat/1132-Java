public class Order {

  private Payment payment;
  private int amount;

  public Order(Payment payment, int amount) {
    this.payment = payment;
    this.amount = amount;
  }

  public void processOrder() {
    System.out.println("Processing order with amount: " + amount);
    payment.pay();
    System.out.println("Order processed successfully.");
  }
}
