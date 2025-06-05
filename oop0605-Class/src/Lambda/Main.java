package Lambda;

public class Main {

  public static void main(String[] args) {

//使用匿名類別 num a + num b
Calculator calculator = new Calculator() {
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }
};

//印出匿名方法
  System.out.println(calculator.add(1, 2));

//使用 Lambda 表達式
  Calculator calculator2 = (int a, int b) -> a + b;
  System.out.println(calculator2.add(1, 2));
}
}