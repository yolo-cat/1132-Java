package Map;

public class Student {
  private String studentId;
  private String name;
  private int age;

  public Student(String studentId) {
    this.studentId = studentId;
  }

  public Student(String studentId, String name, int age) {
    this.studentId = studentId;
    this.name = name;
    this.age = age;
  }

  public String getStudentId() {
    return studentId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // 可选：添加getAge和setAge方法
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
