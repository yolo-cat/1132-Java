package Q2;

import java.util.Random;

public class CarUtil {
  private final static String[] MODELS = {"Sports Car", "Sedan", "SUV"};
  private final static Random rand = new Random();

  public static String getRandomModel() {
    return MODELS[rand.nextInt(MODELS.length)];
  }

  public static int getRandomHorsePower() {
    return 150 + rand.nextInt(51); // 150~200
  }

  public static int getRandomBoost() {
    return rand.nextInt(4); // 0~3
  }
}
