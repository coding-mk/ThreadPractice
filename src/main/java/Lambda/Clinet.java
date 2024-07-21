package Lambda;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Clinet {
    public static void main(String[] args) {

        //Way-1
        SampleFunctionInterface obj = new SampleClass();
        obj.fun1();

        SampleFunctionInterface obj2 = new SampleFunctionInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymos Class");
            }
        };

        obj2.fun1();

        //Lambda Expression
        Consumer<String> consumer = (x) -> {
            System.out.println("Consumer Lambda implementation " + x);
        };

        consumer.accept("Manish");

        BiConsumer<String, Integer> biConsumer = (x, y) -> {
            System.out.println(x + " , " + y);
        };
        biConsumer.accept("Scaler", 1);

        BinaryOperator<Integer> binaryOperator = (x,y) -> {
            return x+y;
        };
        System.out.println(binaryOperator.apply(10,20));

        Predicate<String> predicate = (str) -> str.length() > 10;
        System.out.println(predicate.test("ScalerBanglore"));
    }
}
