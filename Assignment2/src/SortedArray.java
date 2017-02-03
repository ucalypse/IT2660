/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20
 */

import java.io.Console;

public class SortedArray {
    int max, counter;
    StudentListings[] students;

    public SortedArray(int maximumSize) {
     max = maximumSize;
     students = new StudentListings[0];
    }

    public boolean insert(StudentListings newNode)  {
        boolean nodeInserted = false;
        StudentListings[] newArray = new StudentListings[students.length + 1];
        if (newArray.length > max)  {
            return false;
        }
        counter = 0;
        if(students.length == 0)    {
            newArray[counter] = newNode;
        }
        else {
            for (StudentListings student : students) {
                boolean addNewNode = student.compareTo(newNode.name) < 0;

                newArray[counter] = student;
                counter++;
                if (addNewNode && nodeInserted == false) {
                    newArray[counter] = newNode;
                    nodeInserted = true;
                    counter++;
                }
            }
        }
        students = newArray;
           return true;
    }

    public StudentListings fetch(String targetKey)  {
        StudentListings node;
        StudentListings temp;
        int i = 0;
        while(i < counter && !(students[i].compareTo(targetKey) == 0))  {
            i++;
        }
        
        if (i == counter) return null;
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
        while (i < counter && !(students[i].compareTo(targetKey) == 0)) {
            i++;
        }
        if (i == counter) return false;
        students[i] = students[counter - 1];
        students[counter - 1] = null;
        counter -= 1;
        return true;
    }

    public boolean update(String targetKey, StudentListings newNode)    {
        if(delete(targetKey) == false) return false;
        else if (insert(newNode) == false) return false;
        else return true;
    }

}
