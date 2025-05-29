package Q3;

import java.util.Random;

public class PokemonUtil {
  public static final int MAX_LEVEL = 20;
  public static final int MAX_CANDY = 100;
  private static final String[] TYPES = {"Fire", "Water", "Grass"};
  private static final Random rand = new Random();

  public static String generateType() {
    int idx = rand.nextInt(TYPES.length);
    return TYPES[idx];
  }

  public static int generateLevel() {
    return rand.nextInt(MAX_LEVEL) + 1;
  }

  public static int generateCandy() {
    return rand.nextInt(MAX_CANDY + 1);
  }
}
