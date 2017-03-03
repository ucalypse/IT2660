/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] args)  {
        String studentName;
        int studentId;
        int choice = 0;
        double studentGpa;
        LinkedList linkedList = new LinkedList();

        while(choice != 6) {
            Scanner input = new Scanner(System.in);
            runMenu();
            choice = input.nextInt();
            Scanner scanner = new Scanner(System.in);
            if (choice == 1) {
                System.out.println("Enter Student's name");
                studentName = scanner.nextLine();
                System.out.println("Enter Stuent's ID");
                studentId = scanner.nextInt();
                System.out.println("Enter Student's G.P.A.");
                studentGpa = input.nextDouble();
                linkedList.insert(new Listing(studentName, studentId, studentGpa));
            }
            if (choice == 2) {
                System.out.println("Enter the student name");
                String fetchStudent = scanner.nextLine();
                Listing studentOutput = linkedList.fetch(fetchStudent);
                System.out.println(studentOutput.name + "\n" + studentOutput.id + "\n" + studentOutput.gpa);
            }
            if (choice == 3) {
                System.out.println("Enter the student name you wish to delete");
                String deleteStudent = scanner.nextLine();
                linkedList.delete(deleteStudent);
            }
            if (choice == 4) {

            }
            if (choice == 5) {
                linkedList.showAll();
            }
        }
    }
    public static void runMenu()    {
        System.out.println("Enter:  1 to insert a new student's information\n" +
                " \t\t2 to fetch and output a student's information\n" +
                "\t\t3 to delete a student's information\n" +
                "\t\t4 to update a student's information\n" +
                "\t\t5 to output all the student information\n" +
                "\t\t6 to exit the program");
    }

}
