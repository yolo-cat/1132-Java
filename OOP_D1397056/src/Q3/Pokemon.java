package Q3;

public class Pokemon {
  private static int pokemonCount = 0;

  private final String name;
  private final String type;
  private int level;
  private int candy;

  public Pokemon(String name) {
    this.name = name;
    this.type = PokemonUtil.generateType();
    this.level = PokemonUtil.generateLevel();
    this.candy = PokemonUtil.generateCandy();
    pokemonCount++;
  }

  public Pokemon(String name, String type) {
    this.name = name;
    this.type = type;
    this.level = PokemonUtil.generateLevel();
    this.candy = PokemonUtil.generateCandy();
    pokemonCount++;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getLevel() {
    return level;
  }

  public int getCandy() {
    return candy;
  }

  public static int getPokemonCount() {
    return pokemonCount;
  }

  public void displayInfo() {
    System.out.println("名稱: " + name);
    System.out.println("屬性: " + type);
    System.out.println("等級: " + level);
    System.out.println("糖果數量: " + candy);
  }

  public void evolve() {
    if (candy >= 10) {
      if (level < PokemonUtil.MAX_LEVEL) {
        level++;
        candy -= 10;
        System.out.println(name + " 進化成功！等級提升為 " + level + "，剩餘糖果 " + candy);
      } else {
        System.out.println(name + " 已達最大等級，無法再進化。");
      }
    } else {
      System.out.println(name + " 糖果不足，無法進化。");
    }
  }
}
