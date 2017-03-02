/**
 * Created by dmd383 on 3/2/2017.
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter:  1 to insert a new student's information\n" +
                " \t2 to fetch and output a student's information\n" +
                "\t3 to delete a student's information\n" +
                "\t4 to update a student's information\n" +
                "\t5 to output all the student information\n" +
                "\t6 to exit the program");

        int choice = input.nextInt();
        while(choice != 6) {
            if (choice == 1) {

            }
            if (choice == 2) {

            }
            if (choice == 3) {

            }
            if (choice == 4) {

            }
            if (choice == 5) {
                linkedList.showAll();
            }
        }
    }
}
