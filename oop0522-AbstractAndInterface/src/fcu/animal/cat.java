package fcu.animal;

public class cat implements animal {

  @Override
  public void makeSound() {
    System.out.println("meow");
  }
  @Override
  public void sleep() {
    System.out.println("cat is sleeping");
  }
}
