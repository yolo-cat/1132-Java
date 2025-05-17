import java.util.*;

    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 建立寶可夢1
        System.out.println("請選擇寶可夢1 (1: 皮卡丘, 2: 可達鴨): ");
        int choice1 = sc.nextInt();
        Pokemon p1 = (choice1 == 1) ? new Pickachu() : new Psyduck();
        p1.printInfo();

        // 建立寶可夢2
        System.out.println("請選擇寶可夢2 (1: 皮卡丘, 2: 可達鴨): ");
        int choice2 = sc.nextInt();
        Pokemon p2 = (choice2 == 1) ? new Pickachu() : new Psyduck();
        p2.printInfo();

        // 對戰
        Gym gym = new Gym(p1, p2);
        Pokemon winner = gym.battle(p1, p2);

        System.out.println("寶可夢對戰結束！");
        sc.close();
      }
    }