package OPPS.ShallowCopy;

public class Student {
  String name;
  int age;
  int id;

  public Student(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public Student(Student student) {
    this.name = student.name;
    this.age = student.age;
    this.id = student.id;
  }
}
