package Q3;

import java.util.Random;

public class Gym {
  private final String name;

  public Gym(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Pokemon fight(Pokemon p1, Pokemon p2) {
    System.out.println("對戰開始！");
    p1.displayInfo();
    p2.displayInfo();

    // 先比等級
    if (p1.getLevel() > p2.getLevel()) {
      System.out.println(p1.getName() + " 勝利！");
      return copyPokemon(p1);
    } else if (p2.getLevel() > p1.getLevel()) {
      System.out.println(p2.getName() + " 勝利！");
      return copyPokemon(p2);
    } else {
      // 等級相同，比屬性
      String t1 = p1.getType();
      String t2 = p2.getType();
      if (t1.equals(t2)) {
        // 屬性相同，隨機
        Pokemon winner = (new Random().nextBoolean()) ? p1 : p2;
        System.out.println("屬性相同，隨機勝者: " + winner.getName());
        return copyPokemon(winner);
      } else if ((t1.equals("Fire") && t2.equals("Grass"))
          || (t1.equals("Grass") && t2.equals("Water"))
          || (t1.equals("Water") && t2.equals("Fire"))) {
        System.out.println(p1.getName() + " 屬性勝利！");
        return copyPokemon(p1);
      } else {
        System.out.println(p2.getName() + " 屬性勝利！");
        return copyPokemon(p2);
      }
    }
  }

  // 回傳勝者
  private Pokemon copyPokemon(Pokemon p) {
    return switch (p) {
      case Psyduck _ -> new Psyduck(p.getName());
      case Charizard _ -> new Charizard(p.getName());
      case Bulbasaur _ -> new Bulbasaur(p.getName());
      default -> new Pokemon(p.getName(), p.getType());
    };
  }
}
