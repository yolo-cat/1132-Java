package Q3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pokemon winner = null;
    Gym gym = new Gym("中央道館");

    while (true) {
      System.out.print("請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：");
      String className = sc.nextLine().trim();
      if (className.equalsIgnoreCase("exit")) {
        break;
      }
      System.out.print("請輸入寶可夢名稱：");
      String pokeName = sc.nextLine().trim();

      Pokemon challenger;
      switch (className) {
        case "Psyduck":
          challenger = new Psyduck(pokeName);
          break;
        case "Charizard":
          challenger = new Charizard(pokeName);
          break;
        case "Bulbasaur":
          challenger = new Bulbasaur(pokeName);
          break;
        default:
          System.out.println("無效的寶可夢類別，請重新輸入。");
          continue;
      }

      if (winner == null) {
        winner = challenger;
      } else {
        winner = gym.fight(winner, challenger);
      }
      System.out.println("目前勝利者：");
      winner.displayInfo();
      System.out.println();
    }

    if (winner != null) {
      System.out.println("遊戲結束，最終勝利寶可夢資訊：");
      winner.displayInfo();
      System.out.println("總共創建的寶可夢數量: " + Pokemon.getPokemonCount());
    } else {
      System.out.println("未進行任何對戰。");
    }
    sc.close();
  }
}
