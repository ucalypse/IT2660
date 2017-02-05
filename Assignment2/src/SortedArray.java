/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 9, Spring 2017
Chapter 2 Exercise 20
 */

public class SortedArray {
    int max, counter;
    StudentListings[] students;

    public SortedArray(int maximumSize) {
        max = maximumSize;
        students = new StudentListings[0];
    }
//Had too many problems trying to sort through the insert method, decided to create separate logic for it
    public StudentListings[] sortArray(StudentListings  x [ ] )
    {
        int j;
        boolean flag = true;
        StudentListings temp;

        while ( flag )
        {
            flag = false;
            for ( j = 0;  j < x.length - 1;  j++ )
            {
                if ( x [ j ].name.compareToIgnoreCase( x [ j+1 ].name ) > 0 )
                {
                    temp = x [ j ];
                    x [ j ] = x [ j+1];
                    x [ j+1] = temp;
                    flag = true;
                }
            }
        }
        return x;
    }

    public boolean insert(StudentListings newNode) {
        boolean nodeInserted = false;
        StudentListings[] newArray = new StudentListings[students.length + 1];
        if (newArray.length > max) {
            return false;
        }
        counter = 0;
        if (students.length == 0) {
            newArray[counter] = newNode;
        }

            for (StudentListings student : students) {
                newArray[counter] = student;
                counter++;
                if (nodeInserted == false) {
                    newArray[counter] = newNode;
                    nodeInserted = true;
                    counter++;
                }
        }
        students = newArray;
        return true;
    }

    public StudentListings fetch(String targetKey) {
        for (int i = 0; i < students.length; i++) {
            if (targetKey == students[i].name) {
                return students[i];
            }
        }
        return new StudentListings();
    }

    public boolean delete(String targetKey) {
        boolean nodeDeleted = false;
        StudentListings[] newArray = new StudentListings[students.length - 1];
        counter = 0;
        int newCounter = 0;

        for (StudentListings student : students) {

            if (student.name == targetKey) {
                nodeDeleted = true;
                newCounter++;
            }
            //added error handing in case you try and delete something that's not in the array
            if (nodeDeleted == false && counter < newArray.length) {
                newArray[counter] = students[newCounter];
                counter++;
                newCounter++;
            }
            nodeDeleted = false;
        }
            students = newArray;
            return true;
        }

    public boolean update(String targetKey, StudentListings newNode) {
        if (delete(targetKey) == false) return false;
        else if (insert(newNode) == false) return false;
        else return true;
    }


}
