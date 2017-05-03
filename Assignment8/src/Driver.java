/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due May 4, Spring 2017
Chapter 8 Exercise 39
 */

public class Driver {

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due May 4, 2017     Spring 2017");
        System.out.println("Chapter 8 Exercise 39" + "\n");
    }

    public static void main(String[] args)  {
        //change the values in the sample array to test the input
        int[] sample = new int[]{81,16,2,89,54,23,76,25,37,107,1,74,45,16,31,58};
        displayClassInfo();
        System.out.println("Enter a number array to test assignment");

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(sample);

        System.out.println(mergeSort.swaps);
        System.out.println(mergeSort.comparisons);
        for(int i =0;i<sample.length;i++)   {
            System.out.println(sample[i]);
        }
    }
}
