### java.util.Set 簡介
Set 是 Java 集合框架中的一個介面，代表一組不允許重複元素的集合。Set 介面提供了基本的集合操作，如添加、刪除、查找等。Set 的主要特點包括：
- **唯一性**：Set 不允許儲存重複的元素，這意味著每個元素在集合中只能出現一次。
- **無序性**：Set 不保證元素的順序，這意味著當你遍歷 Set 時，元素的順序可能會改變。
- **實現類別**：Set 介面有多個實現類別，如 HashSet、LinkedHashSet 和 TreeSet 等，每個實現類別都有其特定的特點和用途。
- **常用方法**：Set 介面提供了多種方法來操作集合，如 add（添加元素）、remove（刪除元素）、contains（檢查是否包含元素）、size（獲取集合大小）等。
- **遍歷**：可以使用迭代器或增強型 for 迴圈來遍歷 Set 中的元素。
- **性能**：Set 的性能取決於其實現類別。例如，HashSet 提供快速的存取和查找操作，而 TreeSet 提供有序的元素存儲；LinkedHashSet 結合了 HashSet 的特性和 LinkedList 的特性，保證元素的插入順序。
- **使用場景**：Set 適用於需要儲存唯一元素的場景，如儲存唯一的 ID、標籤等。
- **注意事項**：在使用 Set 時，應確保元素的 hashCode 方法和 equals 方法正確實現，以確保元素的唯一性和正確比較。
- **範例**：
```java
import java.util.Set;
import java.util.HashSet;
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        // 添加元素
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // 重複元素，不會被添加
        
        // 遍歷元素
        for (String fruit : set) {
            System.out.println(fruit);
        }
        
        // 檢查是否包含元素
        if (set.contains("Banana")) {
            System.out.println("Set contains Banana");
        }
        
        // 刪除元素
        set.remove("Orange");
        
        // 獲取大小
        System.out.println("Size of set: " + set.size());
    }
}
```