public class Pokemon {
  private String name;
  private int level;
  private int candy;
  private int attackPower;
  private int defencePower;

  public Pokemon(int level, int candy, int attackPower, int defencePower) {
    this.name = name;
    this.level = level;
    this.candy = candy;
    this.attackPower = attackPower;
    this.defencePower = defencePower;
  }

  // 製作一個產生隨機值方法
  public static int generateRandomValue(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  // Getter and Setter methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getCandy() {
    return candy;
  }

  public void setCandy(int candy) {
    this.candy = candy;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
  }

  public int getDefencePower() {
    return defencePower;
  }

  public void setDefencePower(int defencePower) {
    this.defencePower = defencePower;
  }

  // 增加candy的個數
  public void addCandy(int candy) {
    this.candy += candy; // 增加candy的數量
    System.out.println("增加了 " + candy + " 個糖果，現在有 " + this.candy + " 個糖果");
  }

  // 增加attackPower預設值
  // 花費1個candy可以增加1個attackPower
  public void increaseAttackPower() {
    if (candy > 0) {
      attackPower += 1; // 增加1個attackPower
      candy--; // 減少1個candy
    } else {
      System.out.println("沒有足夠的糖果來增加攻擊力");
    }
  }

  // 增加defencePower預設值
  // 花費1個candy可以增加1個defencePower
  public void increaseDefencePower() {
    if (candy > 0) {
      defencePower += 1; // 增加1個defencePower
      candy--; // 減少1個candy
    } else {
      System.out.println("沒有足夠的糖果來增加防禦力");
    }
  }

  // 增加level預設值
  // 花費20個candy可以增加1個level
  public void LevelUp() {
    if (candy >= 20) {
      level += 1; // 增加1個level
      candy -= 20; // 減少20個candy
    } else {
      System.out.println("沒有足夠的糖果來升級");
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
