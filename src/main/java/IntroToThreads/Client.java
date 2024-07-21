package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World, Printed by : " + Thread.currentThread().getName());

        HelloWorldPrinter hello = new HelloWorldPrinter();
        Thread thread = new Thread(hello);
        thread.start();
    }
}
