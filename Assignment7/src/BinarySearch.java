/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */
public class BinarySearch {
    Node root;

    public void addNode(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node checkNode = root;
            Node parent;
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
                    checkNode = checkNode.leftChild;
                    if (checkNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } //else {
//                    checkNode = checkNode.rightChild;
//                    if (checkNode == null) {
//                        parent.rightChild = newNode;
//                       // checkNode = newNode;
//                        return;
//                    }
//                }
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
