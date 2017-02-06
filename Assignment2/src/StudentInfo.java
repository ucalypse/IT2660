/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 21
 */
import java.util.Scanner;

public class StudentInfo {

    public static void displayClassInfo() {
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 9, 2017     Spring 2017");
        System.out.println("Chapter 2 Exercise 20" + "\n");
    }

    public static void main(String[] args)  {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        displayClassInfo();
        System.out.println("Enter the maximum size of the data set");
        SortedArray sortedArray = new SortedArray(input.nextInt());
        System.out.println("Enter the initial number of students");
        int numberOfStudents = input.nextInt();


        while(choice != 6)  {
            runMenu();
            choice = input.nextInt();
        }
    }
    public static void runMenu()    {
        System.out.println("Choose from the following menu" + "\n" + "1. Insert a new student" + "\n" +
                "2.  Fetch  and output a student's data" + "\n" + "3.  Delete a student's information" +
                "\n" + "4.  Update a student's information" + "\n" + "5.  Output student information" +
                "\n" + "6.  Exit" + "\n");
    }
}
