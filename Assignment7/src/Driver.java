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
            //Guess I havent quite gotten scanner objects down they keep exhibiting unexpected behavior, sorry for newing up 2 of them
            Scanner input = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            runMenu();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter name");
                String studentName = input.nextLine();
                System.out.println("Enter student ID");
                int studentId = input.nextInt();
                System.out.println("Enter student G.P.A");
                double studentGpa = input.nextDouble();
                newStudent = new Node(studentId,studentName,studentGpa);
                binarySearch.addNode(newStudent);

            }
            if (choice == 2) {
                System.out.println("Enter the student ID number");
               int studentFind = input.nextInt();
               Node student = binarySearch.fetchStudent(studentFind);
                System.out.println("Student Name: " + student.name + "\nStudent ID: " + student.key + "\n" + "Student G.P.A.: " + student.gpa + "\n");

            }
            if (choice == 3) {
                System.out.println("Enter the ID of the student you wish to delete");
                int deleteStudent = input.nextInt();
                binarySearch.deleteNode(deleteStudent);

            }
            if (choice == 4) {
                System.out.println("Enter student's ID you wish to update");
                int updateStudentId = input.nextInt();
                System.out.println("Enter new student's name");
                String updateStudentName = input.next();
                System.out.println("Enter new student's ID");
                int newStudentId = input.nextInt();
                System.out.println("Enter new student's GPA");
                double newStudentGpa = input.nextDouble();
                newStudent = new Node(newStudentId,updateStudentName,newStudentGpa);
                binarySearch.updateNode(updateStudentId, newStudent);

            }
            if (choice == 5) {
                //must pass it the root as a parameter to serve as a starting point
                binarySearch.showAllRecords(binarySearch.root);
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
