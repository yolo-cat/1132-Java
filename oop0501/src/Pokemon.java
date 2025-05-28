//public class Pokemon {
//
//    //成員變數如下
//    // name, cp, hp, candy
//    // 所有成員變數的存取修飾子為private
//
//  private String name;
//  private int cp;
//  private int hp;
//  private int candy;
//
//  //隨機產生50-100間的cp值
//  public int generateCpValue() { 2 usages
//    double randomValue = Math.random();
//    randomValue = randomValue * 50 + 50;
//    int cpValue = (int) randomValue + 1;
//    return cpValue;
//  }
//
//    //定義建構方法 public 成員變數 cp 為亂數產生，其餘成員變數為２０
//
//  Pokemon(String name) {
//    this.name = name;
//    this.cp = generateCpValue();
//    this.hp = 20;
//    this.candy = 20;
//  }
//
//    //定義建構方法 1 public//沒有參數
//
//  Pokemon() {
//  }
//
//    //定義建構方法 2 public//讓呼叫者對所有成員變數指定初始值
//
//  Pokemon(String name, int cp, int hp, int candy) {
//    this.name = name;
//    this.cp = cp;
//    this.hp = hp;
//    this.candy = candy;
//  }
//    //定義每一個成員變數的Getter and Setter方法
//    //方法都為public
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public int getCp() {
//    return cp;
//  }
//
//  public void setCp(int cp) {
//    if (cp > 0) {
//    } else {
//      System.out.println("CP cannot be negative.");
//    }
//    this.cp = cp;
//  }
//
//  public int getHp() {
//    return hp;
//  }
//
//  public void setHp(int hp) {
//    if (hp > 0) {
//    } else {
//      System.out.println("HP cannot be negative.");
//    }
//    this.hp = hp;
//  }
//  public int getCandy() {
//    return candy;
//  }
//
//  public void setCandy(int candy) {
//    if (candy > 0) {
//      this.candy = candy;
//    } else {
//      System.out.println("Candy cannot be negative.");
//    }
//    this.candy = candy;
//  }
//
//  //定義一個 print() 方法
//  //這個方法會印出所有成員變數的值
//  //定義一個 printstring（String input）方法
//
//  public static void printString(String input) {
//    System.out.println(input);
//  }
//}
