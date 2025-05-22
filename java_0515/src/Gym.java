public class Gym {
  // 這裡的Pokemon是父類別
  private Pokemon pokemon1;
  private Pokemon pokemon2;

  // 建構子
  public Gym(Pokemon pokemon1, Pokemon pokemon2) {
    this.pokemon1 = pokemon1;
    this.pokemon2 = pokemon2;
  }

  // battle方法，依規則判斷勝負，回傳勝利寶可夢
  public Pokemon battle(Pokemon p1, Pokemon p2) {
    System.out.println("寶可夢對戰開始！");
    System.out.println("寶可夢1: " + p1.getName());
    System.out.println("寶可夢2: " + p2.getName());

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

  // 多寶可夢依序兩兩對戰，直到剩下一隻
  public Pokemon battle(java.util.List<Pokemon> pokemons) {
    java.util.List<Pokemon> current = new java.util.ArrayList<>(pokemons);
    int round = 1;
    while (current.size() > 1) {
      System.out.println("\n=== Gym 第 " + round + " 輪對戰 ===");
      java.util.List<Pokemon> next = new java.util.ArrayList<>();
      for (int i = 0; i < current.size(); i += 2) {
        if (i + 1 < current.size()) {
          Pokemon p1 = current.get(i);
          Pokemon p2 = current.get(i + 1);
          System.out.println("參戰寶可夢資訊：");
          p1.printInfo();
          p2.printInfo();
          Pokemon winner = battle(p1, p2);
          System.out.println("勝者資訊：");
          winner.printInfo();
          next.add(winner);
        } else {
          System.out.println(current.get(i).getName() + " 無對手，自動晉級！");
          current.get(i).printInfo();
          next.add(current.get(i));
        }
      }
      current = next;
      round++;
    }
    System.out.println("最終勝者：");
    current.get(0).printInfo();
    return current.get(0);
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
