package OPPS.ShallowCopy;

public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Alice", 20, 1);
    Student student2 = new Student(student1);
    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.id);
  }
}
