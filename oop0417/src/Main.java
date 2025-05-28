import java.util.*; //類似include 引進相關之物件來用

public class Main { //類別名稱, Java為物件導向語言
    public static void main(String[] args) { //程式進入點, 可有多個

        int count = 0, input = 0; //資料的宣告
        boolean success = false; // 修改為false，表示尚未找到HOOK
        boolean[] bucket = new boolean[10]; //陣列的宣告
        boolean[] knifes = new boolean[bucket.length];
        // true 已插刀, false 未插刀, bucket.length為bucket參數=10

        bucket[new Random().nextInt(bucket.length)] = true;

        // 利用Random物件, 隨機置入一個死亡在bucket中
        Scanner scanner = new Scanner(System.in);

        //產生一個輸入物件 scanner
        while (!success && count < 5) { // 修改條件：未找到HOOK且未滿五刀

            // 秀出沒有刀的洞
            for (int i = 0; i < knifes.length - 1; i++) //流程控制
                if (!knifes[i])   System.out.print(i + ", "); //判斷, 利用System 物件輸出
            if (!knifes[knifes.length - 1]) //因最後一個洞後就不印”,”了
                System.out.println(knifes.length - 1);

            input = scanner.nextInt(); // 取得user的下一刀的位置(一個整數), 輸入

            if (input < 0 || input >= bucket.length || knifes[input])
                continue; // 重插
            knifes[input] = true; // 插入刀子
            success = bucket[input]; // true表示找到HOOK, false表示安全
            count++;
        }

        // 根據結果顯示不同訊息
        if (success) {
            if (count <= 3) {
                System.out.println("你真是太神奇了");
            } else {
                System.out.println("你通過了");
            }
        } else {
            System.out.println("你輸了GG");
        }
    }
}
