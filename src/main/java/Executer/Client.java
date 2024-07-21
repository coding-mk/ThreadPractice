package Executer;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=1;i<=100;i++){
            NumberPrinter num = new NumberPrinter(i);
            executorService.execute(num);
        }
    }
}
