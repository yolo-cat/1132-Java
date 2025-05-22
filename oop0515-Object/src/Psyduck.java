public class Psyduck extends Pokemon {
  public Psyduck() {
    super(
      Pokemon.generateRandomValue(4, 6), // level
      0,                                 // candy
      Pokemon.generateRandomValue(1, 5), // attackPower
      Pokemon.generateRandomValue(6, 10) // defencePower
    );
    int suffix = (int)(Math.random() * 100);
    setName("可達鴨" + String.format("%02d", suffix));
  }
}