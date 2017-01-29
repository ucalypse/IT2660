/*Donald Davis Assignment 1
IT 2660 Data Structures & Algorithms CRN 13907
January 26 Spring 2017
Chapter 1 Exercise 42
 */


import java.util.Scanner;
public class Question42 {
    public static void main(String[] args) {

        Listing[] listings = new Listing[3];
       //1st loop sets the value of the array
        for (int i = 0; i < listings.length; i++) {
            listings[i] = getInput();
        }
        //2nd loop outputs the objects in the array, as strings, in reverse order
        for (int i = listings.length - 1; i >= 0; i--)    {
            System.out.println(listings[i].toString());
        }
        

    }
//method used to get the input from the user
    public static Listing getInput() {
        Scanner input = new Scanner(System.in);
        Listing person = new Listing();
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        person.setName(userName);
        System.out.println("Enter your age: ");
        int userAge = Integer.parseInt(input.nextLine());
        person.setAge(userAge);
        return person;
    }
}