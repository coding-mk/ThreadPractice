package OddEvenThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    private final int max;
    private volatile int current = 1;

    public Client(int max)
    {
        this.max = max;
    }

    public void printEven()
    {
        synchronized (this)
        {
            while(current <= max)
            {
                if(current %2 == 1)
                {
                    try
                    {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }else {
                    System.out.println("Even Thread: " + current);
                    current++;
                    notify();
                }
            }
        }
    }

    public void printOdd()
    {
        synchronized (this)
        {
            while(current <= max)
            {
                if(current %2 == 0)
                {
                    try
                    {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }else {
                    System.out.println("Odd Thread: " + current);
                    current++;
                    notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        int maxNumber = 100;
        Client client = new Client(maxNumber);

        Thread oddThread = new Thread(client::printOdd, "OddThread");
        Thread evenThread = new Thread(client::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();

    }
}
