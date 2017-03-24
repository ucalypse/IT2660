import java.util.LinkedList;
import java.util.List;

public class Key {
    int number;
    List<Ticket> ticket;

    public Key()    {
        ticket = new LinkedList<Ticket>();
    }

    public Ticket fetch(int key) {
        ticket.get(1);
        return new Ticket("wah");
    }
}
