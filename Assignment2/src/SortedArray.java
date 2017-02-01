/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20
 */
import java.util.Scanner;

public class SortedArray {
    int max, next;
    StudentListings[] students;

    public SortedArray(int maximumSize) {
     max = maximumSize;
     students = new StudentListings[max];
    }

    public boolean insert(StudentListings newNode)  {
        next = 0;
        students = new StudentListings[max];
        if (next >= max)    {
            return false;
        }
        students[next] = newNode.deepCopy();
        if (students[next] == null)  {
            return false;
        }
        next += next;
        return true;
    }

    public StudentListings fetch(String targetKey)  {
        StudentListings node;
        StudentListings temp;
        int i = 0;
        while(i < next && !(students[i].compareTo(targetKey) == 0))  {
            i++;
        }
        if (i == next) return null;
        node = students[i].deepCopy();
        if (i != 0) {
            temp = students[i - 1];
            students[i - 1] = students[i];
            students[i] = temp;
        }
        return node;
    }

    public boolean delete(String targetKey) {
        int i = 0;
        while (i < next && !(students[i].compareTo(targetKey) == 0)) {
            i++;
        }
        if (i == next) return false;
        students[i] = students[next - 1];
        students[next - 1] = null;
        next -= next;
        return true;
    }

    public boolean update(String targetKey, StudentListings newNode)    {
        if(delete(targetKey) == false) return false;
        else if (insert(newNode) == false) return false;
        else return true;
    }
    public static void main(String[] args)  {
        SortedArray sortedArray = new SortedArray(3);
        sortedArray.students = new StudentListings[]{
                new StudentListings("Donald Davis", "31", "2.5"),
                new StudentListings("Peter Faulkner", "32", "3.0"),
                new StudentListings("Henry Dafoux", "33", "3.5")};
        System.out.println(sortedArray.students.length);
        //Testing insert method
        sortedArray.insert(new StudentListings("Randy Wilcox", "34", "3.2"));
        System.out.println(sortedArray.students.toString());
        //Testing fetch method
       // String shouldBeDonaldDavis = sortedArray.fetch("Donald Davis").toString();
      //  System.out.println(shouldBeDonaldDavis);
        //Testing delete method
       // sortedArray.delete("Donald Davis");
        for (int i = 0; i<sortedArray.students.length; i++) {
            System.out.println(sortedArray.students[i].toString());
        }
    }
}
