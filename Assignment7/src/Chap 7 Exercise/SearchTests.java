/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 27, Spring 2017
Chapter 7 Exercise 31
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchTests {
    Node node;
    BinarySearch binarySearch = new BinarySearch();
    @Test
    public void addNode_becomes_root()  {

        binarySearch.addNode(new Node(1, "Donny",1));

        assertEquals(1, binarySearch.root.key);

    }
    @Test
    public void addNode_inserts_node()  {
        binarySearch.addNode(new Node(10, "a",1));
        binarySearch.addNode(new Node(17, "b",1));
        binarySearch.addNode(new Node(4, "c",1));
        binarySearch.addNode(new Node(7, "d",1));
        binarySearch.addNode(new Node(20, "e",1));
        binarySearch.addNode(new Node(14, "f",1));


        assertEquals(4,binarySearch.root.leftChild.key);
        assertEquals(7,binarySearch.root.leftChild.rightChild.key);
        assertEquals(17,binarySearch.root.rightChild.key);
        assertEquals(20,binarySearch.root.rightChild.rightChild.key);
        assertEquals(14,binarySearch.root.rightChild.leftChild.key);


    }

    @Test
    public void fetchStudent_returns_correct_student()  {
        Node testNode1 = new Node(10, "A",1);
        Node testNode2 = new Node(4, "B",1);
        Node testNode3 = new Node(7, "C",1);
        Node testNode4 = new Node(15, "D",1);
        Node testNode5 = new Node(17, "I",1);

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
        binarySearch.addNode(new Node(10, "a",1));
        binarySearch.addNode(new Node(17, "b",1));
        binarySearch.addNode(new Node(4, "c",1));
        binarySearch.addNode(new Node(7, "d",1));
        binarySearch.addNode(new Node(20, "e",1));
        binarySearch.addNode(new Node(14, "f",1));

        assertEquals("f",binarySearch.fetchStudent(17).leftChild.name);
    }

    @Test
        public void showAllRecordsTest() {
        Node testNode1 = new Node(10, "A",1);
        Node testNode2 = new Node(4, "B",1);
        Node testNode3 = new Node(7, "C",1);
        Node testNode4 = new Node(15, "D",1);
        Node testNode5 = new Node(17, "I",1);

        binarySearch.addNode(testNode1);
        binarySearch.addNode(testNode2);
        binarySearch.addNode(testNode3);
        binarySearch.addNode(testNode4);
        binarySearch.addNode(testNode5);
        binarySearch.showAllRecords(testNode1);

    }
        @Test
        public void return_parent_finds_correct_parent() {
        Node testNode1 = new Node(10, "A",1);
        Node testNode2 = new Node(4, "B",1);
        Node testNode3 = new Node(7, "C",1);
        Node testNode4 = new Node(15, "D",1);
        Node testNode5 = new Node(17, "I",1);

        binarySearch.addNode(testNode1);
        binarySearch.addNode(testNode2);
        binarySearch.addNode(testNode3);
        binarySearch.addNode(testNode4);
        binarySearch.addNode(testNode5);

        assertEquals(4, binarySearch.getParent(7).key);
        assertEquals(15, binarySearch.getParent(17).key);

    }


        @Test
        public void deleteNode_deletes_correct_value() {
        Node testNode1 = new Node(10, "A",1);
        Node testNode2 = new Node(4, "B",1);
        Node testNode3 = new Node(7, "C",1);
        Node testNode4 = new Node(15, "D",1);
        Node testNode5 = new Node(17, "I",1);
        Node testNode6 = new Node(13, "J",1);
        Node testNode7 = new Node(2, "K",1);
        Node testNode8 = new Node(14, "L",1);

        binarySearch.addNode(testNode1);
        binarySearch.addNode(testNode2);
        binarySearch.addNode(testNode3);
        binarySearch.addNode(testNode4);
        binarySearch.addNode(testNode5);
        binarySearch.addNode(testNode6);
        binarySearch.addNode(testNode7);
        binarySearch.addNode(testNode8);

        binarySearch.deleteNode(testNode4.key);
        binarySearch.deleteNode(testNode3.key);
        binarySearch.deleteNode(testNode6.key);
        binarySearch.deleteNode(testNode2.key);
        assertEquals(17, testNode1.rightChild.key);
        assertNull(testNode2.rightChild);
        assertEquals(2,testNode1.leftChild.key);
        assertEquals(14, testNode5.leftChild.key);



    }

}
