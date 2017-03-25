import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 30, Spring 2017
Chapter 5 Exercise 40
 */
public class StadiumTest {
    Ticket ticket = new Ticket("Donny", 100);
    Sales sales = new Sales();
    
    @Test
    public void insert_stores_value()   {
        sales.addTicket(ticket);

        assertEquals(sales.tickets[0].name, "Donny");
    }
    @Test
    public void fetch_maps_to_ticket()  {
        sales.addTicket(ticket);
        sales.addTicket(new Ticket("Pete", 300));
        sales.addTicket(new Ticket("Chris", 500));
        sales.addTicket(new Ticket("Dave", 153));
        Ticket expected = sales.fetchTicket(500);
        assertEquals(expected.name, "Chris");
    }

}
