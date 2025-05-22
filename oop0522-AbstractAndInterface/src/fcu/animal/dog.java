package fcu.animal;

public class dog extends animal{
  public dog(String name) {
  super(name);
}

@Override
public void makesound() {
  System.out.println("wof");
  }
}
