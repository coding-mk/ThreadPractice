package Comparator;

public class Student {
    public int rollnNumber;
    public int marks;
    public String name;

    public Student(String name, int rollnNumber, int marks){
        this.name = name;
        this.rollnNumber = rollnNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[Name= " + this.name + ", rollNumber= " + this.rollnNumber + ", Marks= " +this.marks + "]\n";
    }
}
