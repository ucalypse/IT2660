/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20
 */
import java.util.Scanner;

public class SortedArray {
    String name;
    String id;
    String gpa;
    Scanner input = new Scanner(System.in);

    public SortedArray(String n, String num, String a){
        name = n;
        id = num;
        gpa = a;
    }
    public SortedArray(){

    }

    public String toString()    {
        return("Name is " + name + "\nG.P.A. is " + gpa + "\nStudent ID is " + id + "\n");
    }
    public SortedArray deepCopy(){
        SortedArray clone = new SortedArray(name, id, gpa);
        return clone;
    }

    public SortedArray getInput()   {
        SortedArray student = new SortedArray();
        System.out.println("Enter the Student Name");
        student.name = input.nextLine();
        System.out.println("Enter the StudentID");
        student.id = input.nextLine();
        System.out.println("Enter the Student's G.P.A.");
        student.gpa = input.nextLine();
        return student;
    }

    public static void displayClassInfo()   {
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 9, 2017     Spring 2017");
        System.out.println("Chapter 2 Exercise 19,20 + 21" + "\n");
    }
    //Handcoded SortedArray method
    public String[] sortArrayFetch(int high, String targetKey)  {
        String[] inputArray = new String[high];
        int low = 0;
        int maximum = high - 1;
        int i = maximum / 2;
        while(targetKey != inputArray[i]){
            if(targetKey < inputArray[i] && maximum != low) {
                maximum = i - 1;
            }
            else    {
                low = i +1;
            }
            i = (low + maximum) / 2;
        }
        return inputArray[i];

    }

    public static void main(String[] args)  {
        SortedArray sortedStudent;
        SortedArray copyOfnewStudent;
        SortedArray sortedArray = new SortedArray();

        displayClassInfo();

    }
}
