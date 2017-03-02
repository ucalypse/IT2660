import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTests {
    LinkedList linkedList = new LinkedList();
    Node node= new Node();
    Listing listing = new Listing("Donny", 1, 3.5);
    @Test
    public void linkedList_stores_value()   {
        boolean expected = linkedList.insert(listing);
        assertEquals(true, expected);
    }
    @Test
    public void fetch_returns_correct_listing() {
        Listing listing1 = new Listing("Donny", 1, 3.5);
        Listing listing2 = new Listing("Peter", 2, 3.5);
        Listing listing3 = new Listing("Ronald", 3, 3.5);
        linkedList.insert(listing1);
        linkedList.insert(listing2);
        linkedList.insert(listing3);
        Listing test = linkedList.fetch(listing2.name);
        assertEquals(2, test.id);
        System.out.println(test.name);
    }
    @Test
    public void delete_deletes_record() {
        Listing listing1 = new Listing("Donny", 1, 3.5);
        Listing listing2 = new Listing("Peter", 2, 3.5);
        Listing listing3 = new Listing("Ronald", 3, 3.5);
        linkedList.insert(listing1);
        linkedList.insert(listing2);
        linkedList.insert(listing3);
     //   linkedList.delete(listing1.name);
        linkedList.showAll();
    }
    @Test
    public void insert_inserts_record() {
        Listing listing1 = new Listing("Donny", 1, 3.5);
        Listing listing2 = new Listing("Peter", 2, 3.5);
        Listing listing3 = new Listing("Ronald", 3, 3.5);
        linkedList.insert(listing1);
        linkedList.insert(listing2);
        linkedList.insert(listing3);
        //Need to figure out how to assert that the value was inserted
        linkedList.showAll();
    }
}
