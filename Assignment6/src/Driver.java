/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 13, Spring 2017
Chapter 6 Exercises 16 & 18
 */

import java.util.Scanner;

public class Driver {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        displayClassInfo();
        BinarySearch binarySearch = new BinarySearch();
        Gcd gcd = new Gcd();
        System.out.println("Number 16" + "\n");
        //This is a sample program, you could easily import scanner class and take user input for this example it would work the same way
        System.out.println("The numbers 1-9 are in the array, which position would you like to locate?");
        int sampleInt = scanner.nextInt();
        if(sampleInt > 0 && sampleInt < 10){
            System.out.println("The number " + sampleInt + " is at " + binarySearch.fetch(sampleInt) + " " + "position." + "\n");
        }
        else System.out.println("Number not in set");
        System.out.println("Number 18" + "\t");
        System.out.println("Enter the 1st number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("The GCD of " + number1 + " and " + number2+ " is:");
        System.out.println(gcd.findGcd(number1, number2));

    }

    public static void displayClassInfo() {
        System.out.println("Donald Davis");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due April 13, 2017     Spring 2017");
        System.out.println("Chapter 6 Exercises 16 & 18" + "\n");
    }
}
