/**
 * Created by Dada on 5/1/2017.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTests {

    @Test
    public void merge_sort_sorts_array()    {
        MergeSort mergeSort = new MergeSort();
        int[] testArray = {12,20,2,15,1,36};
        int[] testArray2 = {1,6,2,3,5,4};
        mergeSort.sort(testArray2);
        for(int i = 0; i<mergeSort.newNumberArray.length; i++) {
            System.out.println(mergeSort.newNumberArray[i]);
        }

        mergeSort.sort(testArray);
        for(int i = 0; i<mergeSort.newNumberArray.length; i++) {
            System.out.println(mergeSort.newNumberArray[i]);
        }
    }
}
