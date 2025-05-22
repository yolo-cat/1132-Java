import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("請輸入寶可夢數量（2~6）：");
    int n = sc.nextInt();
    if (n < 2) n = 2;
    if (n > 6) n = 6;

    List<Pokemon> pokemons = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.printf("請選擇第%d隻寶可夢 (1: 皮卡丘, 2: 可達鴨, 3: 小火龍): ", i + 1);
      int choice = sc.nextInt();
      Pokemon p;
      if (choice == 1) {
        p = new Pickachu();
      } else if (choice == 2) {
        p = new Psyduck();
      } else {
        p = new Charmander();
      }
      p.printInfo();
      pokemons.add(p);
    }

    System.out.println("\n所有寶可夢資訊：");
    for (Pokemon p : pokemons) {
      p.printInfo();
    }

    // 使用 Gym 類別進行多組寶可夢對戰
    Gym gym = new Gym(null, null);
    gym.battle(pokemons);

    System.out.println("寶可夢對戰結束！");
    sc.close();
  }
}
