/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */
import java.util.Scanner;

public class Driver {
    public static void main(String[] args)  {
        displayClassInfo();
        int choice = 0;

        BinarySearch binarySearch = new BinarySearch();
        Node newStudent;
        while (choice != 6) {
            Scanner input = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            runMenu();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter name");
                String studentName = input.nextLine();
                System.out.println("Enter student ID");
                int studentId = input.nextInt();
                newStudent = new Node(studentId,studentName);
                binarySearch.addNode(newStudent);

            }
            if (choice == 2) {
                System.out.println("Enter the student number");
               int studentFind = input.nextInt();
               Node student = binarySearch.fetchStudent(studentFind);
                System.out.println("Student Name: " + student.name + "\nStudent ID: " + student.key);

            }
            if (choice == 3) {
                System.out.println("Enter the id of the student you wish to delete");
                int deleteTicket = input.nextInt();

            }
            if (choice == 4) {
                System.out.println("Enter the id of the student you wish to update");
                int updateTicket = input.nextInt();
                System.out.println("Enter new ticket holder's name");

                System.out.println("Enter the new ticket holder's seat");
                int newNumber = input.nextInt();

            }
            if (choice == 5) {
                binarySearch.showAllRecords();
            }
        }

    }

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due April 27, 2017     Spring 2017");
        System.out.println("Chapter 7 Exercise 31" + "\n");
    }
    public static void runMenu()    {
        System.out.println("Enter:  1 to add a new student\n" +
                " \t\t2 to lookup a student\n" +
                "\t\t3 to delete a student record\n" +
                "\t\t4 to update a student's information\n" +
                "\t\t5 to output all student records\n" +
                "\t\t6 to exit the program");
    }
}
