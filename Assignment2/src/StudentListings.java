/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 19
 */
import java.util.Scanner;

public class StudentListings {
    String name;
    String id;
    String gpa;
    Scanner input = new Scanner(System.in);

    public StudentListings(String n, String num, String a){
        name = n;
        id = num;
        gpa = a;
    }
    public StudentListings(){

    }
    public String toString()    {
        return("Name is " + name + "\nG.P.A. is " + gpa + "\nStudent ID is " + id + "\n");
    }
    public StudentListings deepCopy(){
        StudentListings clone = new StudentListings(name, id, gpa);
        return clone;
    }
    public int compareTo(String targetKey){
        return (name.compareTo(targetKey));
    }

    public StudentListings getInput()   {
        StudentListings student = new StudentListings();
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

    public static void main(String[] args)  {
        StudentListings newStudent;
        StudentListings copyOfnewStudent;
        StudentListings studentListings = new StudentListings();

        displayClassInfo();

         newStudent = studentListings.getInput();
         copyOfnewStudent = studentListings.deepCopy();
         System.out.println(copyOfnewStudent.toString());
         int compareToInfo = studentListings.compareTo("Mark");
         System.out.println(compareToInfo);
         System.out.println(newStudent.toString());

    }
}
