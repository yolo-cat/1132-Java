//    透過繼承方式，減少重複程式碼的撰寫
public class Charmander extends Pokemon {

  public Charmander(String name) {

    // 透過super關鍵字來呼叫父類別的建構子
    // 這裡的super()會呼叫Pokemon類別的建構子
    // 這裡的name, level, candy, attackPower, defencePower是父類別Pokemon的屬性
    // 這裡的super()會呼叫Pokemon類別的建構子
    // 這裡的name, level, candy, attackPower, defencePower是父類別Pokemon的屬性
    super(
        Pokemon.generateRandomValue(1, 100),
        Pokemon.generateRandomValue(1, 100),
        Pokemon.generateRandomValue(1, 100),
        Pokemon.generateRandomValue(1, 100));
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

  // 引入printinfo方法
  public void printInfo() {
    System.out.println("-------------------------");
    System.out.println("寶可夢名稱: " + getName());
    System.out.println("等級: " + getLevel());
    System.out.println("糖果數量: " + getCandy());
    System.out.println("攻擊力: " + getAttackPower());
    System.out.println("防禦力: " + getDefencePower());
    System.out.println("-------------------------");
  }
}
