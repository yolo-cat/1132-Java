package Q2;

public class Car {
  private final String name;
  private final String model;
  private final int horsepower;
  private final int boost;

  public Car(String name) {
    this.name = name;
    this.model = CarUtil.getRandomModel();
    this.horsepower = CarUtil.getRandomHorsePower();
    this.boost = CarUtil.getRandomBoost();
  }

  public String getName() {
    return name;
  }

  public String getModel() {
    return model;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public int getBoost() {
    return boost;
  }

  public int getFinalHorsePower() {
    return horsepower + boost * 5;
  }
}
