/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 30, Spring 2017
Chapter 5 Exercise 40
 */
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
