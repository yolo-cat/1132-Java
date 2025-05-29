package Q1;

import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入您的姓名: ");
    String input = sc.nextLine().trim();

    // 處理多餘空格，分割單字
    String[] words = input.split("\\s+");
    StringBuilder formatted = new StringBuilder();

    for (String word : words) {
      if (word.isEmpty()) continue;
      String lower = word.toLowerCase();
      // 首字母大寫，其餘小寫
      String capWord = Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
      // 編碼
      String encoded = encode(capWord);
      formatted.append(encoded).append(" ");
    }

    System.out.println("HI " + formatted.toString().trim());
    sc.close();
  }

  // 編碼函式
  private static String encode(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      switch (c) {
        case 'A': case 'a':
          sb.append('4'); break;
        case 'E': case 'e':
          sb.append('3'); break;
        case 'I': case 'i':
          sb.append('1'); break;
        case 'O': case 'o':
          sb.append('0'); break;
        case 'S': case 's':
          sb.append('5'); break;
        case 'T': case 't':
          sb.append('7'); break;
        default:
          sb.append(c);
      }
    }
    return sb.toString();
  }
}
