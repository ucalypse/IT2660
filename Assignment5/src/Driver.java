/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 30, Spring 2017
Chapter 5 Exercise 40
 */

import java.util.Scanner;

public class Driver {

    public static void main(String[] args)  {
        displayClassInfo();
        int choice = 0;
        Sales sales = new Sales();
        String name;
        int seatNumber;

        while(choice != 6) {
            Scanner input = new Scanner(System.in);
            runMenu();
            choice = input.nextInt();
            Scanner scanner = new Scanner(System.in);
            if (choice == 1) {
                System.out.println("Enter name");
                name = scanner.nextLine();
                System.out.println("Enter ticket number");
                seatNumber = scanner.nextInt();
                sales.addTicket(new Ticket(name,seatNumber));
            }
            if (choice == 2) {
                System.out.println("Enter the ticket number");
                int fetchTicket = scanner.nextInt();
                Ticket ticketOutput = sales.fetchTicket(fetchTicket);
                if (ticketOutput != null) {
                    System.out.println("Name: " + ticketOutput.name + "\n");
                } else {
                    System.out.println("No Records Found");
                }
            }
            if (choice == 3) {
                System.out.println("Enter the ticket number you wish to delete");
                int deleteTicket = scanner.nextInt();
                if (sales.deleteTicket(deleteTicket) == false)  {
                    System.out.println("No students in list");
                }
            }
//            if (choice == 4) {
//                System.out.println("Enter student's name that you wish to update");
//                updateStudent = input.next();
//                System.out.println("Enter new Student's name");
//                studentName = scanner.nextLine();
//                System.out.println("Enter new Stuent's ID");
//                studentId = scanner.nextInt();
//                System.out.println("Enter new Student's G.P.A.");
//                studentGpa = input.nextDouble();
//                linkedList.update(updateStudent, new Listing(studentName, studentId, studentGpa));
//            }
//            if (choice == 5) {
//                sales.showAll();
//            }
        }
       // sales.addTicket(new Ticket(""));
        System.out.println(sales.tickets);
    }

    public static void runMenu()    {
        System.out.println("Enter:  1 to add a new ticket sale\n" +
                " \t\t2 to lookup a ticket\n" +
                "\t\t3 to cancel ticket purchase\n" +
                "\t\t4 to update a ticketholder's information\n" +
                "\t\t5 to output all the tickets sold\n" +
                "\t\t6 to exit the program");
    }

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due March 30, 2017     Spring 2017");
        System.out.println("Chapter 5 Exercise 40" + "\n");
    }
}
