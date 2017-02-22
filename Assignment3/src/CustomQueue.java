/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 23, Spring 2017
Chapter 3 Exercise 21
 */

import java.util.StringTokenizer;
import java.util.Scanner;

public class CustomQueue {
    String name = "";
    StringTokenizer parse;

    public static void displayClassInfo() {
        System.out.println("Donald Davis Assignment 3");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 23, 2017     Spring 2017");
        System.out.println("Chapter 3 Exercise 21" + "\n");
    }
    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        displayClassInfo();
        System.out.println("Enter the expression in post-fixed notation separated by a space");
        String sampleString = input.nextLine();
        try {
            result = calculator.performCalculation(sampleString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            result=0;
        }
        System.out.println(result);
    }
}



