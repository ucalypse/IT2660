/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 13, Spring 2017
Chapter 6 Exercises 16 & 18
 */
public class BinarySearch {
    int[] key = new int[10];
    int first, middle, last;
//was originally trying to set values in the fetch method but had too many problems and decided to set them in the constructor instead
    public BinarySearch()   {
        for (int i = 0; i<key.length; i++)  {
            key[i] = i + 1;
        }
        first = key[0];
        last = key[key.length-1];
    }
    public int fetch(int target) {
        middle = (first + last) / 2;
        if(last < first) {
            return -1;
        }
//This is where I check for the target
        if(target==key[middle]) {
            return middle;
        } else if(key[middle] < target) {
            middle -= 1;
            first = middle;
            //recursion
            return fetch(target);
        } else {
            middle += 1;
            last = middle;
            //recursion
            return fetch(target);
        }
    }
}
