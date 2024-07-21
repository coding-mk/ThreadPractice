package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientMergeSort {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(1,2,5,6,8,4,9,3,7);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSort mergeSort = new MergeSort(numbers);
        Future<List<Integer>> sortArray = executorService.submit(mergeSort);

        System.out.println(sortArray.get());
    }
}
