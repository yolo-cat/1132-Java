package Q3;

public class Charizard extends Pokemon {
  public Charizard(String name) {
    super(name, "Fire");
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("類別名稱: Charizard");
  }
}
