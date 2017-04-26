/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */
public class BinarySearch {
    Node root;
    Node checkNode;
    Node parent;

    public void addNode(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            checkNode = root;
            while (true) {
                parent = checkNode;
                if (newNode.key > checkNode.key) {
                    checkNode = checkNode.rightChild;
                    if (checkNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
                if (newNode.key < checkNode.key) {
                    parent = checkNode;
                    checkNode = checkNode.leftChild;
                    if (checkNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    parent = checkNode;
                    checkNode = checkNode.rightChild;
                    if (checkNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
                }
        }

    }

    public Node fetchStudent(int key)   {
        Node currentNode = root;
        while (true)    {
            if (currentNode.key == key) {
                return currentNode;
            }
            else if (key < currentNode.key)    {
                currentNode = currentNode.leftChild;
            }
            else currentNode = currentNode.rightChild;
        }
    }

    public void showAllRecords()    {
        Node currentNode = root;
        while (currentNode != null) {
            System.out.println("Student Name: " + currentNode.name + "\nStudent ID: " + currentNode.key);
            if (currentNode.leftChild != null) {
                currentNode = currentNode.leftChild;
            }
            else if (currentNode.rightChild != null)    {
                currentNode = currentNode.rightChild;
                showAllRecords();
            }
            else currentNode = null;
        }
    }

}
