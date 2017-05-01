/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */
public class Node {
    Node leftChild, rightChild;
    String name;
    int key;
    double gpa;

    public Node(int Key, String Name, double GPA)    {
        key = Key;
        name = Name;
        gpa = GPA;
    }
}
