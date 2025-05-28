import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        隨機產生１－１００整數
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請猜一個1到100的整數：");

        while (true) {
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
//                將guess設置最小值，並提示範圍在guess-100
                System.out.println("猜的數字太小了，請再試一次！範圍在" + guess + "到100之間");
            } else if (guess > randomNumber) {
//                將guess設置最大值，並提示範圍在1到guess
                System.out.println("猜的數字太大了，請再試一次！範圍在1到" + guess + "之間");
            } else {
                System.out.println("恭喜你，猜對了！答案是：" + randomNumber);
            }
        }

    }
}