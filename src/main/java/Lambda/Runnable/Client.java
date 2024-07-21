package Lambda.Runnable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world, printed by " + Thread.currentThread().getName());
        Runnable runnable = () -> System.out.println("Hello world, printed by " + Thread.currentThread().getName());

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(
                () -> System.out.println("Hello world, printed by " + Thread.currentThread().getName())
        );
        thread1.start();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,9,7,0);

        Collections.sort(list, (a,b) -> b-a);

        System.out.println(list);

    }
}
