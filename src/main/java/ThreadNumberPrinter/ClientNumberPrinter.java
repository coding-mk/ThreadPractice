package ThreadNumberPrinter;

public class ClientNumberPrinter {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            NumberPrinter num = new NumberPrinter(i);
            Thread thread = new Thread(num);
            thread.start();
        }
    }
}
