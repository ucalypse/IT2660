/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTests {
    Node node;
    BinarySearch binarySearch = new BinarySearch();
    @Test
    public void addNode_becomes_root()  {
        node = new Node(1, "Donny");
        binarySearch.addNode(node);

        assertEquals(binarySearch.root.key, node.key);

    }
    @Test
    public void addNode_inserts_node()  {
        Node testNode1 = new Node(10, "Donny");
        Node testNode2 = new Node(4, "Donny");
        Node testNode3 = new Node(7, "Donny");
        Node testNode4 = new Node(15, "Donny");
        binarySearch.addNode(testNode1);
        binarySearch.addNode(testNode2);
        binarySearch.addNode(testNode3);
        binarySearch.addNode(testNode4);

        assertEquals(binarySearch.root.leftChild.key, 4);
        assertEquals(binarySearch.root.leftChild.rightChild.key, 7);
        assertEquals(binarySearch.root.rightChild.key, 15);


    }

    @Test
    public void fetchStudent_returns_correct_student()  {
        Node testNode1 = new Node(10, "A");
        Node testNode2 = new Node(4, "B");
        Node testNode3 = new Node(7, "C");
        Node testNode4 = new Node(15, "D");
        Node testNode5 = new Node(17, "I");

        binarySearch.addNode(testNode1);
        binarySearch.addNode(testNode2);
        binarySearch.addNode(testNode3);
        binarySearch.addNode(testNode4);
        binarySearch.addNode(testNode5);

        assertEquals("B",binarySearch.fetchStudent(4).name);
        assertEquals("D",binarySearch.fetchStudent(15).name);
        assertEquals("I",binarySearch.fetchStudent(17).name);

    }

    @Test
    public void deleteStudent_deletes_student() {
        binarySearch.addNode(new Node(10, "a"));
        binarySearch.addNode(new Node(17, "b"));
        binarySearch.addNode(new Node(4, "c"));
        binarySearch.addNode(new Node(7, "d"));
        binarySearch.addNode(new Node(20, "e"));
        binarySearch.addNode(new Node(14, "f"));
        System.out.println(binarySearch.fetchStudent(4).name);

        assertEquals("f",binarySearch.fetchStudent(17).leftChild.name);
    }

}
