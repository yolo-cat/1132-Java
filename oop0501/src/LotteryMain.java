public class LotteryMain {
  public static void main(String[] args) {
    // 產生一組隨機的樂透號碼
    int[] lotteryNumbers = Lottery.generateLotteryNumbers();

    // 顯示產生的樂透號碼
    System.out.print("Generated Lottery Numbers: ");
    for (int number : lotteryNumbers) {
      System.out.print(number + " ");
    }
  }
}
