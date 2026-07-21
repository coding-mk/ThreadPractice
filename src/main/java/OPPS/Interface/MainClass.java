package OPPS.Interface;

public class MainClass {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.walk();
    dog.makeSound();
    dog.eat();
    dog.run();

    Cat cat = new Cat();
    cat.walk();
    cat.makeSound();    
    cat.eat();
    cat.run();

    Animal animal = new Dog();
    animal.walk();
    animal.makeSound();
    animal.eat();
    animal.run();
  }
}
