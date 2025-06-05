package Anonymous;

public class Main {
  public static void main(String[] args) {

    Cat kitty = new Cat();
    kitty.sound();

//    Animal myAnimal = new Animal() {
//      @Override
//      public void sound() {
//        System.out.println("Animal makes a sound");
//      }
//
//      @Override
//      public void eat() {
//        System.out.println("Animal is eating");
//      }
//    };
//    myAnimal.sound();

    Toy toy = new Toy();
    toy.pressButton(kitty);
    toy.pressButton(new Animal(){
      @Override
      public void sound() {
        System.out.println("Animal makes a sound");
      }

      @Override
      public void eat() {
        System.out.println("Animal is eating");
      }
    });

  }
}
