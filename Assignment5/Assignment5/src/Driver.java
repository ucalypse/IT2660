/**
 * Created by Dada on 3/22/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Driver {
    ArrayList<Ticket> tickets;

    public static void main(String[] args)  {
        String testName = "Donny";
        Key key = new Key();
        Sales sales = new Sales();
        sales.addTicket(new Ticket(testName));
        System.out.println(sales.tickets.);
    }
}
