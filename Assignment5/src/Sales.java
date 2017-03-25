import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Sales {
    Ticket[] tickets = new Ticket[98000];
    int counter = 0;
    int[] keys = new int[98000];

    public void addTicket(Ticket newTicket){

        keys[counter] = newTicket.seatNumber;
        tickets[newTicket.seatNumber] = newTicket;
        counter ++;
    }

    public Ticket fetchTicket(int seatNumber)    {
        int index;
        for(int i = 0; i < keys.length; i++)   {
            if(keys[i] == seatNumber)   {
                return tickets[seatNumber];
            }
        }
       return null;
    }
}
