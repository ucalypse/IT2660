/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due May 4, Spring 2017
Chapter 8 Exercise 39
 */
public class MergeSort {
    int[] newNumberArray, temp;
    int arrayLength;
    int swaps=0;
    int comparisons=0;

    public void sort(int[] input) {
        newNumberArray = input;
        arrayLength = input.length;
        temp = new int[arrayLength];
        mergeSort(0, arrayLength - 1);
    }
//sorting array by value
    public void mergeSort(int low, int high) {
        if (low < high) {
            comparisons++;
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
                swaps++;
            }

            int low = l;
            int middle = m + 1;
            int high = l;
            while (low <= m && middle <= h) {

                if (temp[low] <= temp[middle]) {
                    comparisons++;
                    newNumberArray[high] = temp[low];
                    low++;
                    swaps++;
                } else {
                    comparisons++;
                    newNumberArray[high] = temp[middle];
                    middle++;
                    swaps++;
                }
                high++;
            }
            while (low <= m) {
                newNumberArray[high] = temp[low];
                high++;
                low++;
                swaps++;
            }
        }
}
