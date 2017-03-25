/**
 * Created by Dada on 3/22/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Driver {
    ArrayList<Ticket> tickets;

    public static void main(String[] args)  {

        Sales sales = new Sales();
       // sales.addTicket(new Ticket(""));
        System.out.println(sales.tickets);
    }
}
