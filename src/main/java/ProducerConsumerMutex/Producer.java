package ProducerConsumerMutex;

import java.util.Queue;

public class Producer implements Runnable{
    Queue<Object> store;
    private int maxSize;
    private String name;

    Producer(Queue<Object> store, int maxSize, String name){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.size() < maxSize){
                    System.out.println("Consumer: " + this.name + " has consumed the shirt, store size: " + this.store.size());
                    store.add(new Object());
                }
            }

        }
    }
}
