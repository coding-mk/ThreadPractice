package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;

    public MergeSort (List<Integer> arrayToSort){
        this.arrayToSort= arrayToSort;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        //divide the array into 2 parts.
        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        //sort leftArray and right Array to 2 separate threads.
        MergeSort leftMergeSorter = new MergeSort(leftArray);
        MergeSort rightMergeSorter = new MergeSort(rightArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> futureLeftSortedArray = executorService.submit(leftMergeSorter);
        Future<List<Integer>> futureRightSortedArray = executorService.submit(rightMergeSorter);

        List<Integer> sortArray = new ArrayList<>();
        List<Integer> leftSortedArray = futureLeftSortedArray.get();
        List<Integer> rightSortedArray = futureRightSortedArray.get();

        int i=0,j=0;
        while(i<leftSortedArray.size() && j <rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortArray.add(leftSortedArray.get(i));
                i++;
            }else{
                sortArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size() ){
            sortArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j<rightSortedArray.size() ){
            sortArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortArray;
    }
}
