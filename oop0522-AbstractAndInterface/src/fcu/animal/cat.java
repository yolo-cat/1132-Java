package fcu.animal;

public class cat extends animal {
  public cat(String name) {
    super(name);
  }

  @Override
  public void makesound() {
    System.out.println("meow");
  }
}
