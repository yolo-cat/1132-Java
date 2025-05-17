public class Gym {
  // 這裡的Pokemon是父類別
  private Pokemon pokemon1;
  private Pokemon pokemon2;

  // 建構子
  public Gym(Pokemon pokemon1, Pokemon pokemon2) {
    this.pokemon1 = pokemon1;
    this.pokemon2 = pokemon2;
  }

  // battle方法，隨機決定先攻，並依規則判斷勝負，回傳勝利寶可夢
  public Pokemon battle(Pokemon p1, Pokemon p2) {
    System.out.println("寶可夢對戰開始！");
    System.out.println("寶可夢1: " + p1.getName());
    System.out.println("寶可夢2: " + p2.getName());

//    // 隨機決定先攻
//    if (Math.random() < 0.5) {
//      System.out.println(p1.getName() + " 先攻！");
//    } else {
//      System.out.println(p2.getName() + " 先攻！");
//      // 交換順序
//      Pokemon temp = p1;
//      p1 = p2;
//      p2 = temp;
//    }

    // 判斷勝負
    if (p1.getLevel() > p2.getLevel()) {
      System.out.println(p1.getName() + " 勝利！");
      return p1;
    } else if (p1.getLevel() < p2.getLevel()) {
      System.out.println(p2.getName() + " 勝利！");
      return p2;
    } else {
      int power1 = p1.getAttackPower() - p1.getDefencePower();
      int power2 = p2.getAttackPower() - p2.getDefencePower();
      if (power1 > power2) {
        System.out.println(p1.getName() + " 勝利！");
        return p1;
      } else if (power1 < power2) {
        System.out.println(p2.getName() + " 勝利！");
        return p2;
      } else {
        // 隨機決定勝負
        Pokemon winner = Math.random() < 0.5 ? p1 : p2;
        System.out.println(winner.getName() + " 勝利！（隨機）");
        return winner;
      }
    }
  }

  // Getter and Setter methods
  public Pokemon getPokemon1() {
    return pokemon1;
  }

  public void setPokemon1(Pokemon pokemon1) {
    this.pokemon1 = pokemon1;
  }

  public Pokemon getPokemon2() {
    return pokemon2;
  }

  public void setPokemon2(Pokemon pokemon2) {
    this.pokemon2 = pokemon2;
  }
}
