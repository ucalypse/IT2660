/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 19 Driver
 */
import java.util.Scanner;
public class StudentListingsProgram {



    public static void displayClassInfo() {
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 9, 2017     Spring 2017");
        System.out.println("Chapter 2 Exercise 19" + "\n");
    }

    public static void main(String[] args) {
        StudentListings newStudent = new StudentListings();
        StudentListings copyOfnewStudent;
        StudentListingsProgram studentListingsProgram = new StudentListingsProgram();
        StudentListings studentListings = new StudentListings();

        displayClassInfo();

        newStudent = studentListingsProgram.getInput(newStudent);
        copyOfnewStudent = studentListings.deepCopy();
        int compareToInfo = newStudent.compareTo("Mark");
        System.out.println(compareToInfo);
        System.out.println(newStudent.toString());


    }

    public StudentListings getInput(StudentListings newStudent) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Student Name");
        newStudent.name = input.nextLine();
        System.out.println("Enter the StudentID");
        newStudent.id = input.nextLine();
        System.out.println("Enter the Student's G.P.A.");
        newStudent.gpa = input.nextLine();
        return newStudent;
    }
}
