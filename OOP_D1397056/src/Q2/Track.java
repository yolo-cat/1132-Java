package Q2;

import java.util.Random;

public class Track {
  public static Car race(Car car1, Car car2) {
    int hp1 = car1.getFinalHorsePower();
    int hp2 = car2.getFinalHorsePower();
    if (hp1 > hp2) {
      return car1;
    } else if (hp2 > hp1) {
      return car2;
    } else {
      int m1 = getModelRank(car1.getModel());
      int m2 = getModelRank(car2.getModel());
      if (m1 > m2) {
        return car1;
      } else if (m2 > m1) {
        return car2;
      } else {
        // 隨機選擇
        return (new Random().nextBoolean()) ? car1 : car2;
      }
    }
  }

  private static int getModelRank(String model) {
    return switch (model) {
      case "Sports Car" -> 3;
      case "Sedan" -> 2;
      case "SUV" -> 1;
      default -> 0;
    };
  }
}
