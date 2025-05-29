package Q3;

public class Psyduck extends Pokemon {
  public Psyduck(String name) {
    super(name, "Water");
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("類別名稱: Psyduck");
  }
}
