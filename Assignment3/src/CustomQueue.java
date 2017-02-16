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
        String operator;
        CustomQueue customQueue = new CustomQueue();
        displayClassInfo();
        System.out.println("Enter the expression in post-fixed notation separated by a space");
        String sampleString = input.nextLine();
        customQueue.performCalculation(sampleString);
    }
    public int[] processLine(String strings) {
        int[] intArray = new int[strings.length()];
        for(int i=0;i<strings.length();i++) {
            intArray[i] = Integer.parseInt(String.valueOf(strings.charAt(i)));
        }
        return intArray;
    }
    public StringTokenizer getTokens(String tokens)    {
        int i = 0;
        int[] numericIntegers = new int[tokens.length()];
        parse = new StringTokenizer(tokens," ");
        while(parse.hasMoreTokens())    {
            if(!parse.nextToken().equals("+") || !parse.nextToken().equals("-") || !parse.nextToken().equals("*") || !parse.nextToken().equals("/"))  {
                numericIntegers[i] = Integer.parseInt(parse.nextToken());
                i++;
            }
        }
        return parse;
    }
    public String[] performCalculation(String tokens) {
       int i = 0;
        String[] newArray = new String[tokens.length()];
        parse = new StringTokenizer(tokens," ");

        while(parse.hasMoreTokens())    {
               newArray[i] = parse.nextToken();
                i++;
        }
        return newArray;
    }
}



