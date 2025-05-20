public class Student {
      private String name;
      private String gender;
      private int age;

      public Student(String name, String gender, int age) {
          this.name = name;
          this.gender = gender;
          this.age = age;
      }

      @Override
      public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null || getClass() != obj.getClass()) return false;
          Student student = (Student) obj;
          return age == student.age &&
                 name.equals(student.name) &&
                 gender.equals(student.gender);
      }

      @Override
      public String toString() {
          return "Student{name='" + name + "', gender='" + gender + "', age=" + age + "}";
      }
  }