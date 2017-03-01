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
        linkedList.fetch(listing2.name);
        assertEquals(2, listing.id);
    }
}
