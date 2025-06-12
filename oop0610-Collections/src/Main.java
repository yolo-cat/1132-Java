
public class Main {

  public static class Box<T> {
    private T value; // 儲存泛型類型的值

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }
  }


//  Box<String> stringBox = new Box<>();
//  stringBox.setValue("Hello World");
//  String S = stringBox.getValue();
//
//  Box<Integer> integerBox = new Box<>();
//  integerBox.setValue(12345);
//  int i = integerBox.getValue();
//
//  Box<Boolean> booleanBox = new Box<>();
//  booleanBox.setValue(true);
//  boolean b = booleanBox.getValue();

//  Set<String> Numbers = new HashSet();
//
//  Number.add(1);
//  Number.add(2);

//  Box box = new Box();
//  box.setValue("Hello World");
//  box.setValue(12345);
//  box.setValue(true);
//
//   Object object = box.getValue();
//   if(object instanceof Integer) {
//     int i = (Integer) object;
//  }
}
