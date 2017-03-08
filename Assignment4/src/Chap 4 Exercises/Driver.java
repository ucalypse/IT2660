/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] args)  {
        displayClassInfo();
        String studentName, updateStudent;
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
                if (studentOutput != null) {
                    System.out.println(studentOutput.name + "\n" + studentOutput.id + "\n" + studentOutput.gpa);
                } else {
                    System.out.println("No Records Found");
                }
            }
            if (choice == 3) {
                System.out.println("Enter the student name you wish to delete");
                String deleteStudent = scanner.nextLine();

                if (linkedList.delete(deleteStudent) == false)  {
                    System.out.println("No students in list");
                }
            }
            if (choice == 4) {
                System.out.println("Enter student's name that you wish to update");
                updateStudent = input.next();
                System.out.println("Enter new Student's name");
                studentName = scanner.nextLine();
                System.out.println("Enter new Stuent's ID");
                studentId = scanner.nextInt();
                System.out.println("Enter new Student's G.P.A.");
                studentGpa = input.nextDouble();
                linkedList.update(updateStudent, new Listing(studentName, studentId, studentGpa));
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
    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due March 9, 2017     Spring 2017");
        System.out.println("Chapter 4 Exercise 27" + "\n");
    }

}
