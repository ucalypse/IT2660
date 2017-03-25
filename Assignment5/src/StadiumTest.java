import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Ticket expected = sales.fetchTicket(100);
        assertEquals(expected.name, "Donny");
    }

}
