package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Apurva", 1, 80),
                new Student("Kriti", 2, 50),
                new Student("Nandini", 4, 40),
                new Student("Manish", 5, 90),
                new Student("Aditya", 3, 95),
                new Student("Shravanti", 6, 90)
        );

        //Comparator
        Comparator<Student> marksComparator = (st1, st2) -> st1.rollnNumber - st2.rollnNumber;
        Collections.sort(studentList, marksComparator);
        System.out.println(studentList);
    }
}
