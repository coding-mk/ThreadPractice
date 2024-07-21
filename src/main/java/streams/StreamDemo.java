package streams;

import Comparator.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,4,7,8,9,6,3,2);

        //Write a method to extract only the odd numbers from the list
        List<Integer> odd = numbers.stream().filter((x) -> x%2 == 1).sorted().toList();
        System.out.println(odd);

        List<Student> studentList = Arrays.asList(
                new Student("Apurva", 1, 80),
                new Student("Kriti", 2, 50),
                new Student("Nandini", 4, 40),
                new Student("Manish", 5, 90),
                new Student("Aditya", 3, 95),
                new Student("Shravanti", 6, 90)
        );

        System.out.println(studentList.stream().filter((x) -> x.marks > 80).toList());

        System.out.println(studentList.stream().map((x) -> x.name).sorted().toList());
    }
}
