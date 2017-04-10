/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 13, Spring 2017
Chapter 6 Exercises 16 & 18
 */
public class Driver {
    public static void main(String[]args) {
        displayClassInfo();
        BinarySearch binarySearch = new BinarySearch();
        //This is a sample program, you could easily import scanner class and take user input for this example it would work the same way
        System.out.println("The number 4 is at " + binarySearch.fetch(4) + " " + "position.");

    }

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due April 13, 2017     Spring 2017");
        System.out.println("Chapter 6 Exercises 16 & 18" + "\n");
    }
}
