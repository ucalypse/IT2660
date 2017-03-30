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
        for(int i = 0; i < keys.length; i++)   {
            if(keys[i] == seatNumber)   {
                return tickets[seatNumber];
            }
        }
       return null;
    }

    public boolean deleteTicket(int seatNumber) {
        int[] keyCopy = new int[keys.length];
        int secondCounter = 0;
        if(tickets[seatNumber] != null) {
            tickets[seatNumber] = null;
        }
        else    {
            return false;
        }
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != seatNumber) {
                keyCopy[secondCounter] = keys[i];
                secondCounter ++;
            }
        }
        keys = keyCopy;
        return true;
    }

    public void updateTicket(Ticket newTicket, int oldNumber)  {
       deleteTicket(oldNumber);
       addTicket(newTicket);
        System.out.println("Entry updated successfully!");
    }

    public void showAll()   {
        for(int i = 0; i<= counter; i++)    {
            if(keys[i] != 0) {
                System.out.println("Name: " + tickets[keys[i]].name + "\n" + "Seat Number: " + tickets[keys[i]].seatNumber + "\n");
            }
        }
    }
}
