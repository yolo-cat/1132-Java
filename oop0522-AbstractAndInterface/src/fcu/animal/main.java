package fcu.animal;

public class main {

  public static void main(String[] args) {

    toy toy = new toy();

    // Create a cat object
    cat fcuCat = new cat();
    toy.pressButton(fcuCat);

    //Create a dog object
    dog fcuDog = new dog();
    toy.pressButton(fcuDog);
  }
}
