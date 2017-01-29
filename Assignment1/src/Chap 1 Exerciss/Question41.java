/*Donald Davis Assignment 1
IT 2660 Data Structures & Algorithms CRN 13907
January 26 Spring 2017
Chapter 1 Exercise 41
 */

import java.util.Scanner;

public class Question41 {
    Listing person1, person2, person3;
//test method that tests code
    public void createPersonListing()   {
      person1 = new Listing("Donald Davis", 31);
      person2 = new Listing();
      person2.setAge(22);
      person2.setName("Peter Wadsworth");
      System.out.print(person2.toString());
      person3 = new Listing("Frank Worth", 25);
      System.out.print("The 3rd person's name is " + person3.getName() + ", and their age is " + person3.getAge());
    }
    //driver program that demonstrates code
    public static void main(String[] args){
        Listing listing = new Listing();
        Listing person = new Listing("Donald Davis", 31);
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due January 26, 2017     Spring 2017");
        System.out.println("Chapter 1 Exercise 41 + 42");
        listing.input();
        person.toString();

    }
}
  class Listing {
    String name;
    int age;
    Scanner input = new Scanner(System.in);

    public Listing()    {
        name = "";
        age = 0;
    }

    public Listing(String name, int age)    {
        this.name = name;
        this.age = age;
    }

    public String toString()    {
        return ("This person's age is " + age + ", and their name is " + name);
    }

    public void input() {

        Listing person = new Listing();

        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        person.setName(userName);
        System.out.println("Enter your age: ");
        int userAge = Integer.parseInt(input.nextLine());
        person.setAge(userAge);
        System.out.println(person.toString());

    }
//getters and setters
    public void setName(String name)    {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

