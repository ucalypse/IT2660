/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due May 4, Spring 2017
Chapter 8 Exercise 39
 */

import java.util.Scanner;
public class Driver {

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due May 4, 2017     Spring 2017");
        System.out.println("Chapter 8 Exercise 39" + "\n");
    }

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        displayClassInfo();
        System.out.println("Enter a number array to test assignment");
        int testSize = input.nextInt();

        MergeSort mergeSort = new MergeSort();
    }
}
