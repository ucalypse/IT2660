/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20 Driver
 */
public class SortedArrayProgram {
    public static void main(String[] args)  {

        SortedArray sortedArray = new SortedArray(6);
        displayClassInfo();
        //Testing insert method
        System.out.println("Insert Method" + "\n");
        sortedArray.insert(new StudentListings("Z", "31", "2.5"));
        sortedArray.insert(new StudentListings("P", "32", "3.0"));
        sortedArray.insert(new StudentListings("Q", "33", "3.5"));
        sortedArray.insert(new StudentListings("H", "33", "3.5"));
        sortedArray.insert(new StudentListings("B", "33", "3.5"));
        sortedArray.insert(new StudentListings("R", "33", "3.5"));

        sortedArray.sortArray(sortedArray.students);
        for (StudentListings student : sortedArray.students)
        {
            System.out.println(student.toString());
        }
        //Testing fetch method
        System.out.println("Fetch Method" + "\n");
        StudentListings fetchTest = sortedArray.fetch("P");
            System.out.println(fetchTest.toString());

        //Testing delete method
        System.out.println("Delete Method" + "\n");
        sortedArray.delete("Q");
        for (StudentListings student : sortedArray.students)
        {
            System.out.println(student.toString());
        }
        //Testing update method
        sortedArray.update("R", new StudentListings("A", "34", "2.2"));
        sortedArray.sortArray(sortedArray.students);
        System.out.printf("Update Method" + "\n");
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
