public class Lottery {

  //  產生一個隨機整數 1-49 之間
  public static int generateRandomNumber() {
    return (int) (Math.random() * 49) + 1;
  }

  // 產生一組隨機的樂透號碼，每個號碼不重複
  public static int[] generateLotteryNumbers() {
    int[] lotteryNumbers = new int[6];
    boolean[] isNumberUsed = new boolean[50]; // 1-49, index 0 unused

    for (int i = 0; i < lotteryNumbers.length; i++) {
      int number;
      do {
        number = generateRandomNumber();
      } while (isNumberUsed[number]); // 確保號碼不重複
      lotteryNumbers[i] = number;
      isNumberUsed[number] = true; // 標記號碼已使用
    }

    return lotteryNumbers;
  }

}
