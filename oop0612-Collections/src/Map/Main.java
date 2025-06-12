package Map;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> oopClass = new ArrayList<>();
        Student tom = new Student("S001", "Tom", 20);
        Student mary = new Student("S002", "Mary", 21);
        Student john = new Student("S003", "John", 22);

        oopClass.add(tom);
        oopClass.add(mary);
        oopClass.add(john);

        // 請從oopClass中找出學號為“S002"的學生，並印出他的姓名
        for (Student student : oopClass) {
            if (student.getStudentId().equals("S002")) {
                System.out.println("學生姓名: " + student.getName());
                break; // 找到後可以跳出迴圈
            } else {
                System.out.println("找不到學號為 S002 的學生。");




            }
        }
    }
}
