package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class MainClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,9,8);
        Stream<Integer> stream = numbers.stream();

        Stream<Integer> stream1 = Stream.of(1,2,3,6,5,4,9,8,7);

        //Builder Way of creating sream
        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(1);
        sb.add(2);
        sb.add(3);
        sb.add(4);
        sb.add(5);
        sb.add(6);
        sb.add(7);
        sb.add(8);

        List<Integer> odd = numbers.stream().filter((x) -> x % 2 == 1).toList();
        System.out.println(odd);
    }
}
