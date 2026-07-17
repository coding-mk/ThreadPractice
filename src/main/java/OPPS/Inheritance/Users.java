package OPPS.Inheritance;

public class Users {

  String Name;

  String email;

  Users() {
    System.out.println("User class constructor called");
  }

  void login() {
    System.out.println(Name + " is logged in with email: " + email);
  }
}
