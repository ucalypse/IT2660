/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20 Driver
 */
public class SortedArrayProgram {
    public static void main(String[] args)  {

        SortedArray sortedArray = new SortedArray(4);
        displayClassInfo();
        //Testing insert method
        System.out.println("Insert Method" + "\n");
        sortedArray.insert(new StudentListings("Z", "31", "2.5"));
        sortedArray.insert(new StudentListings("P", "32", "3.0"));
        sortedArray.insert(new StudentListings("Q", "33", "3.5"));

        sortedArray.sortArray(sortedArray.students);
        for (StudentListings student : sortedArray.students)
        {
            System.out.println(student.toString());
        }
        //Testing fetch method
        System.out.println("Fetch Method" + "\n");
        StudentListings fetchTest = sortedArray.fetch("A");
            System.out.println(fetchTest.toString());

        //Testing delete method
        System.out.println("Delete Method" + "\n");
        sortedArray.delete("o");
        for (StudentListings student : sortedArray.students)
        {
            System.out.println(student.toString());
        }

    }
    public static void displayClassInfo() {
        System.out.println("Donald Davis Assignment 1");
        System.out.println("IT 2660 Data Structures and Algorithms, CRN 13907,");
        System.out.println("Due February 9, 2017     Spring 2017");
        System.out.println("Chapter 2 Exercise 20" + "\n");
    }
}
