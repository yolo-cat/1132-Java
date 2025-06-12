package LotterySet;

import java.util.Set;

public class LotteryGenerator {

  //從1到所指定的maxValue間，取出numbers個數的樂透號碼
  //例如：maxValue=100, numbers=5，則會從1到100間取出5個號碼
  public static Set<Integer> generateLotteryNumbers(int maxValue, int numbers) {
    if (maxValue < 1 || numbers < 1 || numbers > maxValue) {
      throw new IllegalArgumentException("Invalid maxValue or numbers");
    }

    Set<Integer> lotteryNumbers = new java.util.TreeSet<>();
    java.util.Random random = new java.util.Random();

    while (lotteryNumbers.size() < numbers) {
      int number = random.nextInt(maxValue) + 1; // 產生1到maxValue的隨機數
      System.out.println(numbers);
      lotteryNumbers.add(number);
    }

    return lotteryNumbers;
  }

  public static void main(String[] args) {
    // 測試generateLotteryNumbers方法
    Set<Integer> lotteryNumbers = generateLotteryNumbers(100, 5);
    for (Integer number : lotteryNumbers) {
      System.out.print(number + " ");
    }
    System.out.println("Generated Lottery Numbers: " + lotteryNumbers);
  }
}
