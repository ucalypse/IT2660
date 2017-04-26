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
        //1st node entered becomes root
        if (root == null) {
            root = newNode;
        } else {
            checkNode = root;
            //infinite loop to take the place of recursion, which I prefer not to use if at all possible as it is hard to read
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
                    //added this to prevent null reference when its not the 1st time through the loop
                    parent = checkNode;
                    checkNode = checkNode.leftChild;
                    if (checkNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    //added this to prevent null reference when its not the 1st time through the loop
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

    public Node fetchStudent(int key) {
        Node currentNode = root;
        while (true) {
            if (currentNode.key == key) {
                return currentNode;
            } else if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
            } else currentNode = currentNode.rightChild;
        }
    }

    public boolean showAllRecords(Node currentNode) {
//        while (currentNode != null) {
//            System.out.println("Name: " + currentNode.name + "\n" + "ID: " + currentNode.key + "\n");
//            if (currentNode.leftChild != null)  {
//                currentNode = currentNode.leftChild;
//                showAllRecords();
//            }
//            if (currentNode.rightChild != null) {
//                currentNode = currentNode.rightChild;
//                showAllRecords();
//            }
//        }
        if (currentNode == null) {
            return true;
        }
        System.out.println("Name: " + currentNode.name + "\n" + "ID: " + currentNode.key + "\n");
        showAllRecords(currentNode.leftChild);
        showAllRecords(currentNode.rightChild);
        return false;
    }


}
