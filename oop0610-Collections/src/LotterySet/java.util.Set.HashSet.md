### java.util.HashSet r
HashSet 是 Set 介面的實現類別，使用哈希表來儲存元素。它允許儲存唯一的元素，並且不保證元素的順序。HashSet 的主要特點包括：
- **唯一性**：HashSet 不允許儲存重複的元素。
- **無序性**：HashSet 不保證元素的順序，這意味著當你遍歷 HashSet 時，元素的順序可能會改變。
- **快速存取**：HashSet 提供了快速的元素存取和查找操作，平均時間複雜度為 O(1)。
- **允許 null**：HashSet 允許儲存 null 值，但只能儲存一個 null。
- **非同步**：HashSet 是非同步的，如果多個執行緒同時訪問 HashSet，並且至少有一個執行緒修改了集合結構，則必須手動同步。
- **不保證順序**：HashSet 不保證元素的順序，這意味著當你遍歷 HashSet 時，元素的順序可能會改變。
- **實現 Set 介面**：HashSet 實現了 Set 介面，這意味著它提供了 Set 的所有方法，如 add、remove、contains 等。
- **容量和負載因子**：HashSet 的初始容量和負載因子可以在創建時指定。初始容量是哈希表的大小，負載因子是哈希表在自動擴展之前允許的最大填充程度。當元素數量超過負載因子乘以當前容量時，HashSet 會自動擴展。
- **遍歷**：可以使用迭代器或增強型 for 迴圈來遍歷 HashSet 中的元素。
- **性能**：HashSet 的性能取決於哈希函數的質量和元素的分佈。良好的哈希函數可以減少碰撞，提高存取速度。
- **使用場景**：HashSet 適用於需要快速存取和查找元素的場景，如儲存唯一的 ID、標籤等。
- **注意事項**：在使用 HashSet 時，應確保元素的 hashCode 方法和 equals 方法正確實現，以確保元素的唯一性和正確比較。
- **範例**：
```java
import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
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