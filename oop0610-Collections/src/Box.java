public class Box<K, V> {
// 泛型類別，K為鍵的類型，V為值的類型
  private K key; // 鍵
  private V value; // 值
  // 設定鍵值對
  public K getKey() {
    return key;
  }
  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }
  public void setValue(V value) {
    this.value = value;
  }
}
