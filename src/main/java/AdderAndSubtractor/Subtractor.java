package AdderAndSubtractor;

public class Subtractor implements Runnable{
    private Count count;

    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<=100;i++)
        {
            count.value -= i;
        }
    }
}
