package Anonymous;

public class Cat implements Animal{

  @Override
  public void sound() {
    System.out.println("Meow");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }
}
