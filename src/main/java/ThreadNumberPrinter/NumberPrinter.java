package ThreadNumberPrinter;

public class NumberPrinter implements Runnable{

    private int num;

    public NumberPrinter(int num)
    {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Thread " + num + " " +Thread.currentThread().getName());
    }
}