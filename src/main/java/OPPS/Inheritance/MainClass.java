package OPPS.Inheritance;

public class MainClass {
  public static void main(String[] args) {
    Instructor instructor = new Instructor();
    instructor.Name = "John Doe";
    instructor.email = "xyz@example.com";
    instructor.batchName = "Java Programming";
    instructor.avgRating = 4.5;
    instructor.login();

    D d = new D();
  }
}
