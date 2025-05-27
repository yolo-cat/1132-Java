package fcu.animal;

public class dog implements animal{

  @Override
  public void makeSound() {
    System.out.println("wof");
  }

  @Override
  public void sleep() {
    System.out.println("dog is sleeping");
  }
}
