import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Sales {
    List<Ticket> tickets = new ArrayList<>();
    int counter;

    public void addTicket(Ticket newTicket){
        if (tickets == null)    {
            counter = 1;
        }
        else    {
            counter = tickets.size();
        }
        tickets.add(counter, newTicket);
    }

    public Ticket fetchTicket(int ticketIndex)    {
       return tickets.get(ticketIndex);
    }
}
