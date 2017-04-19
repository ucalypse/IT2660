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
        binarySearch.addNode(node.key, node.name);

        assertEquals(binarySearch.root.key, node.key);

    }
    @Test
    public void addNode_inserts_node()  {
        Node testNode1 = new Node(10, "Donny");
        Node testNode2 = new Node(4, "Donny");
        Node testNode3 = new Node(7, "Donny");
        binarySearch.addNode(testNode1.key, node.name);
        binarySearch.addNode(testNode2.key, node.name);
        binarySearch.addNode(testNode3.key, node.name);

        assertEquals(binarySearch.root.leftChild.key, 4);

    }

}
