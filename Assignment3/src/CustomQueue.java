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
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        CustomQueue customQueue = new CustomQueue();

        displayClassInfo();
        System.out.println("Enter the expression in post-fixed notation separated by a space");
        String sampleString = input.nextLine();
        Stack stack = new Stack(sampleString.length());
        String [] newValues = customQueue.convertToStringArray(sampleString);
        int[] result = customQueue.convertToIntegers(newValues);
        for (int i=0; i< result.length; i++)    {
            System.out.println(result[i]);
        }
        stack.push(sampleString);
    }

    public int[] convertToIntegers(String[] tokens) {
        int i=0;
        int j = 0;
        int[] newArray = new int[tokens.length];
        int returnValue;
        while(i < tokens.length)    {

            if (tokens[i] == "+") {
                int result = Integer.parseInt(tokens[i-1]) + Integer.parseInt(tokens[i-2]);
                newArray[j]=result;
                j++;
            }
            else if (tokens[i] == "-") {
                int result = Integer.parseInt(tokens[i-1]) - Integer.parseInt(tokens[i-2]);
                newArray[j]=result;
                j++;
            }
            else if (tokens[i] == "*") {
                int result = Integer.parseInt(tokens[i-1]) * Integer.parseInt(tokens[i-2]);
                newArray[j]=result;
                j++;
            }
            else if (tokens[i] == "/") {
                int result = Integer.parseInt(tokens[i-1]) / Integer.parseInt(tokens[i-2]);
                newArray[j]=result;
                j++;
            }
            newArray[i] = Integer.parseInt(tokens[i]);
            i++;
        }
        return newArray;
    }

    public String[] convertToStringArray(String tokens) {
       int i = 0;

        parse = new StringTokenizer(tokens," ");

        String[] newArray = new String[parse.countTokens()];
        while(parse.hasMoreTokens())    {
               newArray[i] = parse.nextToken();
                i++;
        }
        return newArray;
    }
}



