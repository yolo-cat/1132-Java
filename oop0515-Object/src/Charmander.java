//    透過繼承方式，減少重複程式碼的撰寫
public class Charmander extends Pokemon {

  public Charmander() {
    super(
      Pokemon.generateRandomValue(1, 3),   // level
      0,                                   // candy
      Pokemon.generateRandomValue(8, 12),  // attackPower
      Pokemon.generateRandomValue(1, 3)    // defencePower
    );
    int suffix = (int)(Math.random() * 100);
    setName("小火龍" + String.format("%02d", suffix));
  }

  // 增加attackPower
  // 花費1個candy可以增加3個attackPower
  public void increaseAttackPower() {
    if (getCandy() > 0) {
      setAttackPower(getAttackPower() + 3); // 增加3個attackPower
      setCandy(getCandy() - 1); // 減少1個candy
    } else {
      System.out.println("沒有足夠的糖果來增加攻擊力");
    }
  }

  // 增加defencePower
  // 花費3個candy可以增加1個defencePower
  public void increaseDefencePower() {
    if (getCandy() > 2) {
      setDefencePower(getDefencePower() + 1); // 增加1個defencePower
      setCandy(getCandy() - 3); // 減少3個candy
    } else {
      System.out.println("沒有足夠的糖果來增加防禦力");
    }
  }
}
