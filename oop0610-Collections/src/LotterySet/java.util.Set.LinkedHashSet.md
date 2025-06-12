### java.util.Set.LinkedHashSet 簡介
LinkedHashSet 是 Set 介面的實現類別，結合了 HashSet 的特性和 LinkedList 的特性。它允許儲存唯一的元素，並且保證元素的插入順序。LinkedHashSet 的主要特點包括：
- **唯一性**：LinkedHashSet 不允許儲存重複的元素。
- **有序性**：LinkedHashSet 會根據元素的插入順序來儲存元素，這意味著當你遍歷 LinkedHashSet 時，元素將按照插入順序返回。
- **快速存取**：LinkedHashSet 提供了快速的元素存取和查找操作，平均時間複雜度為 O(1)。
- **允許 null**：LinkedHashSet 允許儲存 null 值，但只能儲存一個 null。
- **非同步**：LinkedHashSet 是非同步的，如果多個執行緒同時訪問 LinkedHashSet，並且至少有一個執行緒修改了集合結構，則必須手動同步。
- **實現 Set 介面**：LinkedHashSet 實現了 Set 介面，這意味著它提供了 Set 的所有方法，如 add、remove、contains 等。
- **容量和負載因子**：LinkedHashSet 的初始容量和負載因子可以在創建時指定。初始容量是哈希表的大小，負載因子是哈希表在自動擴展之前允許的最大填充程度。當元素數量超過負載因子乘以當前容量時，LinkedHashSet 會自動擴展。
- **遍歷**：可以使用迭代器或增強型 for 迴圈來遍歷 LinkedHashSet 中的元素，元素將按照插入順序返回。
- **性能**：LinkedHashSet 的性能取決於哈希函數的質量和元素的分佈。良好的哈希函數可以減少碰撞，提高存取速度。
- **使用場景**：LinkedHashSet 適用於需要儲存唯一元素並保持插入順序的場景，如儲存唯一的 ID、標籤等。
- **注意事項**：在使用 LinkedHashSet 時，應確保元素的 hashCode 方法和 equals 方法正確實現，以確保元素的唯一性和正確比較。
- **範例**：
```java
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        
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