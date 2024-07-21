package AdderSubractorSynchronization;

public class Count {
    private int value;

    Count(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementCoint(int i){
        this.value += i;
    }
}
