Public class Student {
  retune  age;
}

public void setAge(int age) {
  this.age = age;
}

@override
public boolean equals(Object obj) {
  if ( obj instanceof Student ) {
    Student other = (Student) obj;
    if (this.name.equals(other.name) && this.age == other.age) {
      return true;
    }
  }
  return false;
}