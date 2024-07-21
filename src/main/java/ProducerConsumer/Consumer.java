package ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue<Object> store;
    private int maxSize;
    private String name;

    Consumer(Queue<Object> store, int maxSize, String name){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true){
            if(store.size() > 0){
                System.out.println("Producer: " + this.name + " has produced the shirt, store size: " + this.store.size());
                store.remove();
            }
        }
    }
}
