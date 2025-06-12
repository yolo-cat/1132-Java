package Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

  public static void main(String[] args) {
    Student tom = new Student("S001", "Tom", 20);
    Student mary = new Student("S002", "Mary", 21);
    Student john = new Student("S003", "John", 22);

      // 使用Map來存儲學生資料
      // 分辨 HashMap / LinkedHashMAp / TreeMap 的差異
      Map<String, Student> oopClass = new java.util.HashMap<>();
      oopClass.put("S001", tom);
      oopClass.put("S002", mary);
      oopClass.put("S003", john);

      // 從Map中找出學號為"S002"的學生，並印出他的姓名
      String studentIdToFind = "S002";
      if (oopClass.containsKey(studentIdToFind)) {
        Student student = oopClass.get(studentIdToFind);
        System.out.println("學生姓名: " + student.getName());
      } else {
        System.out.println("找不到學號為 " + studentIdToFind + " 的學生。");
      }

      // 列出所有學生
      System.out.println("所有學生資料（HashMap）：");
      for (Map.Entry<String, Student> entry : oopClass.entrySet()) {
        String studentId = entry.getKey();
        Student student = entry.getValue();
        System.out.println("學號: " + studentId + ", 姓名: " + student.getName() + ", 年齡: " + student.getAge());
      }

      // 使用LinkedHashMap來存儲學生資料
      Map<String, Student> oopClassLinkedHashMap = new java.util.LinkedHashMap<>();
      oopClassLinkedHashMap.put("S001", tom);
      oopClassLinkedHashMap.put("S002", mary);
      oopClassLinkedHashMap.put("S003", john);

      // 從LinkedHashMap中找出學號為"S002"的學生，並印出他的姓名
      if (oopClassLinkedHashMap.containsKey(studentIdToFind)) {
        Student student = oopClassLinkedHashMap.get(studentIdToFind);
        System.out.println("－－－－－ LinkedHashMap 範例開始 －－－－－" );
        System.out.println("學生姓名: " + student.getName());
      } else {
        System.out.println("找不到學號為 " + studentIdToFind + " 的學生。");
      }
      // 列出所有學生
      System.out.println("所有學生資料（LinkedHashMap）：");
      for (Map.Entry<String, Student> entry : oopClassLinkedHashMap.entrySet()) {
        String studentId = entry.getKey();
        Student student = entry.getValue();
        System.out.println("學號: " + studentId + ", 姓名: " + student.getName() + ", 年齡: " + student.getAge());
      }

    // 使用TreeMap來存儲學生資料
    Map<String, Student> oopClassTreeMap = new java.util.TreeMap<>();
    oopClassTreeMap.put("S001", tom);
    oopClassTreeMap.put("S002", mary);
    oopClassTreeMap.put("S003", john);

    // 從TreeMap中找出學號為"S002"的學生，並印出他的姓名
    if (oopClassTreeMap.containsKey(studentIdToFind)) {
      Student student = oopClassTreeMap.get(studentIdToFind);
      System.out.println("－－－－－ TreeMap 範例開始 －－－－－" );
      System.out.println("學生姓名: " + student.getName());
    } else {
      System.out.println("找不到學號為 " + studentIdToFind + " 的學生。");
    }

    // 列出所有學生
    System.out.println("所有學生資料（TreeMap）：");
    for (Map.Entry<String, Student> entry : oopClassTreeMap.entrySet()) {
      String studentId = entry.getKey();
      Student student = entry.getValue();
      System.out.println("學號: " + studentId + ", 姓名: " + student.getName() + ", 年齡: " + student.getAge());
    }



  }
}
