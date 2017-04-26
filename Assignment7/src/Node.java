/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */
public class Node {
    //only added parent to help with delete method which is why I didn't initialize it in constructor
    Node leftChild, rightChild, parent;
    String name;
    int key;

    public Node(int Key, String Name)    {
        key = Key;
        name = Name;
    }
}
