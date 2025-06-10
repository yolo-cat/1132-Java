### java.util.TreeSet 簡介
TreeSet 是 Set 介面的實現類別，使用紅黑樹（Red-Black Tree）來儲存元素。它允許儲存唯一的元素，並且保證元素的順序。TreeSet 的主要特點包括：
- **唯一性**：TreeSet 不允許儲存重複的元素。
- **有序性**：TreeSet 會根據元素的自然順序或指定的比較器（Comparator）來儲存元素，這意味著當你遍歷 TreeSet 時，元素將按照排序順序返回。
- **快速存取**：TreeSet 提供了快速的元素存取和查找操作，平均時間複雜度為 O(log n)。
- **允許 null**：TreeSet 允許儲存 null 值，但只能儲存一個 null，並且如果元素的比較器不允許 null，則會拋出 NullPointerException。
- **非同步**：TreeSet 是非同步的，如果多個執行緒同時訪問 TreeSet，並且至少有一個執行緒修改了集合結構，則必須手動同步。
- **實現 Set 介面**：TreeSet 實現了 Set 介面，這意味著它提供了 Set 的所有方法，如 add、remove、contains 等。
- **比較器**：TreeSet 可以使用自然順序或指定的比較器來排序元素。如果沒有提供比較器，則要求元素實現 Comparable 介面。
- **遍歷**：可以使用迭代器或增強型 for 迴圈來遍歷 TreeSet 中的元素，元素將按照排序順序返回。
- **性能**：TreeSet 的性能取決於元素的比較器和紅黑樹的結構。良好的比較器可以提高存取速度。
- **使用場景**：TreeSet 適用於需要儲存唯一元素並保持排序的場景，如儲存唯一的 ID、標籤等。
- **注意事項**：在使用 TreeSet 時，應確保元素的 compareTo 方法或比較器的 compare 方法正確實現，以確保元素的唯一性和正確排序。
- **範例**：
```java
import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        
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

