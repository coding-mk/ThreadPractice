package OPPS.Inheritance;

public class C extends B {
  C(String name) {
    System.out.println("C's class constructor with parameter: " + name);
  }

  C(String name, int age) {
    System.out.println("C's class constructor with parameters: " + name + ", " + age);
  }
}
