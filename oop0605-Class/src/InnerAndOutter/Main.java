package InnerAndOutter;

public class Main {
  public static void main(String[] args) {
    // 定義 FCU 為字串常數
    final String FCU = "FCU";

    // 建立 Outer 類別的實例
    Outer outer = new Outer(FCU);

    // 建立內部類別 Inner 的實例
    Outer.Inner inner = outer.new Inner();

    // 呼叫 Inner 類別的方法
    inner.printOuterName();
    inner.updateOuterName("Updated FCU");
    inner.printOuterName();

    // 建立靜態內部類別 inner2 的實例
    Outer.inner2 staticInner = new Outer.inner2();
    // 呼叫靜態內部類別的方法
    staticInner.printMessage();
  }
}