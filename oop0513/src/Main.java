//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Fish fish = new Fish();
        Toy myToy = new Toy();
        myToy.pressButton(dog);
        myToy.pressButton(cat);
        myToy.pressButton(cow);
        myToy.pressButton(fish);
   }
}