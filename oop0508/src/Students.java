public class Students extends Person {

  private String studentId;
  private String school;
  private String department; // 變數名稱從 Department 改為 department
  private String password; // 保留 password 欄位及其 getter/setter

  // 更新建構函式以接受 studentId, school, department
  public Students(String id, String name, String studentId, String school, String department) {
//    使用繼承
    super(id, name);
//    定義學生id
    this.studentId = studentId;
//    定義學校
    this.school = school;
//    定義系所
    this.department = department;
  }

  // 移除 Person 類別中已有的 getter/setter 方法
  // public String getId() { ... }
  // public void setId(String id) { ... }
  // public String getName() { ... }
  // public void setName(String name) { ... }
  // public String getEmail() { ... }
  // public void setEmail(String email) { ... }
  // public Date getBirthday() { ... }
  // public void setBirthday(Date birthday) { ... }
  // public String getAddress() { ... }
  // public void setAddress(String address) { ... }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getDepartment() {
    return department; // 更新以反映欄位名稱的更改
  }

  public void setDepartment(String department) {
    this.department = department; // 更新以反映欄位名稱的更改
  }

  //印出學生名字＋“吃飯”
  // 使用 super.getName() 來存取繼承的 name 欄位
  public String eat() {
    System.out.println(super.getName() + "吃飯");
    return null;
  }

  //印出學生名字＋“上課”
  // 使用 super.getName() 來存取繼承的 name 欄位
  public void study() {
    System.out.println(super.getName() + "上課");
  }

//  使用override
  @Override
  public String register() {
    return super.getEmail() + "已登記";
  }

  // 使用overload
  public String register(String email) {
    return email + "已登記";
  }

}

