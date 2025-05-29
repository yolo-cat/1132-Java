package Q2;

import java.util.Scanner;

public class CarGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入第一輛賽車的名稱: ");
    String name1 = sc.nextLine();
    System.out.print("請輸入第二輛賽車的名稱: ");
    String name2 = sc.nextLine();

    Car car1 = new Car(name1);
    Car car2 = new Car(name2);

    System.out.println("=====================");
    System.out.println("第一輛賽車: " + car1.getName() + " (" + car1.getModel() + ")");
    System.out.println("馬力: " + car1.getHorsepower() + ", 加速劑數量: " + car1.getBoost());
    System.out.println("----------------------------");
    System.out.println("第二輛賽車: " + car2.getName() + " (" + car2.getModel() + ")");
    System.out.println("馬力: " + car2.getHorsepower() + ", 加速劑數量: " + car2.getBoost());
    System.out.println("=====================");

    System.out.println("比賽結束！");
    Car winner = Track.race(car1, car2);
    System.out.println(
        "獲勝者是: "
            + winner.getName()
            + " ("
            + winner.getModel()
            + ")，馬力: "
            + winner.getFinalHorsePower());
  }
}
