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
        if (currentNode == null) {
            return true;
        }
        System.out.println("Name: " + currentNode.name + "\n" + "ID: " + currentNode.key + "\n" + "G.P.A: " + currentNode.gpa + "\n");
        //using recursion
        showAllRecords(currentNode.leftChild);
        showAllRecords(currentNode.rightChild);
        return false;
    }

    public Node getParent(int key)  {
        Node currentNode = root;
        parent = currentNode;
        while (true) {
            if (currentNode.key == key) {
                return parent;
            } else if (key < currentNode.key) {
                parent = currentNode;
                currentNode = currentNode.leftChild;
            } else {
                parent = currentNode;
                currentNode = currentNode.rightChild;
            }
        }
    }

    public void deleteNode(int key) {
        Node currentNode = root;
        while (true) {
            if (currentNode.key == key) {
                //handles the case when deletedNode has 2 children
                if (currentNode.rightChild != null && currentNode.leftChild != null && currentNode.key < getParent(key).key)    {
                    getParent(currentNode.key).leftChild = currentNode.rightChild;
                    currentNode.rightChild.leftChild = currentNode.leftChild;
                    break;

                }
                if (currentNode.rightChild != null && currentNode.leftChild != null && currentNode.key > getParent(key).key)    {
                    getParent(currentNode.key).rightChild = currentNode.rightChild;
                    currentNode.rightChild.leftChild = currentNode.leftChild;
                    break;

                }
                //handles the case when deletedNode has no children
                if(currentNode.leftChild == null && currentNode.rightChild == null && currentNode.key < getParent(key).key)   {
                    getParent(key).leftChild = null;
                    break;
                }
                if (currentNode.leftChild == null && currentNode.rightChild == null && currentNode.key > getParent(key).key)    {
                   getParent(key).rightChild = null;
                   break;
                }
                //handles case when there is only 1 child on left side of tree
                if (currentNode.leftChild == null && currentNode.key < getParent(key).key)  {
                    currentNode = currentNode.rightChild;
                    getParent(key).leftChild = currentNode;
                    break;
                }
                if (currentNode.leftChild == null && currentNode.key > getParent(key).key)  {
                    currentNode = currentNode.rightChild;
                    getParent(key).rightChild = currentNode;
                    break;
                }
                //handles case when there is only 1 child on right side of tree
                if (currentNode.rightChild == null && currentNode.key < getParent(key).key)  {
                    currentNode = currentNode.leftChild;
                    getParent(key).leftChild = currentNode;
                    break;
                }
                if (currentNode.rightChild == null && currentNode.key > getParent(key).key)  {
                    currentNode = currentNode.leftChild;
                    getParent(key).rightChild = currentNode;
                    break;
                }
            }
            else if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
            }
            else {
                currentNode = currentNode.rightChild;
            }
        }
        System.out.println("Record deleted successfully" + "\n");
    }

    public void updateNode(int key, Node newStudent) {
        deleteNode(key);
        addNode(newStudent);
    }


}
