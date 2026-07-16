package OPPS.DeepCopy;

public class Student {
  String name;
  int age;
  int id;

  public Student() {
  }

  public Student(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public Student deepCopy(Student student) {
    return new Student(student.name, student.age, student.id);
  }

  public Student deepCopy2(Student student) {
    Student newStudent = new Student();
    newStudent.name = student.name;
    newStudent.age = student.age;
    newStudent.id = student.id;
    return newStudent;
  }
}
