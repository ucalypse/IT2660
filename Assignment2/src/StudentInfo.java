/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 21
 */
import java.util.Scanner;

public class StudentInfo {
    public static SortedArray sortedArray;
    public static void displayClassInfo() {
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 9, 2017     Spring 2017");
        System.out.println("Chapter 2 Exercise 20" + "\n");
    }

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        displayClassInfo();
        System.out.println("Enter the maximum size of the data set");
        sortedArray = new SortedArray(input.nextInt());
        System.out.println("Enter the initial number of students");
        int numberOfStudents = input.nextInt();
            runMenu();
            choice = input.nextInt();
            if(choice == 1) {
                sortedArray.insert(addStudent());
                runMenu();
            }
            else if (choice == 2)   {
                System.out.println(retrieveStudent());
                runMenu();
            }
        }

    public static void runMenu()    {
        System.out.println("Choose from the following menu" + "\n" + "1. Insert a new student" + "\n" +
                "2.  Fetch  and output a student's data" + "\n" + "3.  Delete a student's information" +
                "\n" + "4.  Update a student's information" + "\n" + "5.  Output student information" +
                "\n" + "6.  Exit" + "\n");
    }
    public static StudentListings addStudent() {
        Scanner input = new Scanner(System.in);

        String studentName;
        String studentId;
        String studentGpa;

        System.out.println("Enter the name of the student");
        studentName = input.nextLine();
        System.out.println("Enter the student's ID");
        studentId = input.nextLine();
        System.out.println("Enter the Students G.P.A.");
        studentGpa = input.nextLine();
        return new StudentListings(studentName, studentId, studentGpa);
    }
    public static StudentListings retrieveStudent() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's name that you want to view" + "\n");
        String fetch = input.nextLine();
        return sortedArray.fetch(fetch);
    }
}
