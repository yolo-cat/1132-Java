package Exception;

public class SetMain {

  public static void main(String[] args) {

//    Scanner 儲存５個整數，數字可以重複
    java.util.Set<Integer> numbers = new java.util.HashSet<>();
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("請輸入5個整數（不可以重複）：");
    while (numbers.size() < 5) {
      int number = scanner.nextInt();

      // 檢查輸入是否為整數
      if (!scanner.hasNextInt()) {
        System.out.println("請輸入有效的整數：");
        scanner.next(); // 清除無效輸入
        continue; // 跳過此次迴圈
      }
      // 檢查是否已經存在於集合中
      if (numbers.contains(number)) {
        System.out.println("數字已存在，請輸入另一個整數：");
        continue; // 如果數字已存在，則跳過此次迴圈
      }
      numbers.add(number);
    }

    // 印出所有輸入的整數
    System.out.println("您輸入的整數為：");
    for (Integer num : numbers) {
      System.out.println(num);
    }

    // 將其加總
    int sum = 0;
    for (Integer num : numbers) {
      sum += num;
    }
      System.out.println("加總結果：" + sum);
    }
  }

