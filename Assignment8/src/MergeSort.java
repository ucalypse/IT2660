/**
 * Created by Dada on 5/1/2017.
 */
public class MergeSort {
    int[] newNumberArray;
    int[] temp;

    int arrayLength;

    public void sort(int[] input) {
        newNumberArray = input;
        arrayLength = input.length;
        temp = new int[arrayLength];
        mergeSort(0, arrayLength - 1);
    }
//sorting array by value
    public void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }
//Merging arrays
        public void merge(int l, int m, int h) {
            for (int i = l; i <= h; i++) {
                temp[i] = newNumberArray[i];
            }

            int low = l;
            int middle = m + 1;
            int high = l;
            while (low <= m && middle <= h) {
                if (temp[low] <= temp[middle]) {
                    newNumberArray[high] = temp[low];
                    low++;
                } else {
                    newNumberArray[high] = temp[middle];
                    middle++;
                }
                high++;
            }
            while (low <= m) {
                newNumberArray[high] = temp[low];
                high++;
                low++;
            }
        }
}
