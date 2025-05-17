public class Pickachu extends Pokemon {
  public Pickachu() {
    super(
      Pokemon.generateRandomValue(4, 6), // level
      0,                                 // candy
      Pokemon.generateRandomValue(6, 10),// attackPower
      Pokemon.generateRandomValue(1, 5)  // defencePower
    );
    int suffix = (int)(Math.random() * 100);
    setName("皮卡丘" + String.format("%02d", suffix));
  }
}