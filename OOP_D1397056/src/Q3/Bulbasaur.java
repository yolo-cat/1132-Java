package Q3;

public class Bulbasaur extends Pokemon {
  public Bulbasaur(String name) {
    super(name, "Grass");
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("類別名稱: Bulbasaur");
  }
}
