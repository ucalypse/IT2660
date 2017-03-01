/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
public class LinkedList {
    private Node temp;

    public LinkedList() {
        temp = new Node();
        temp.head= null;
        temp.tail=null;
    }

    public Listing fetch(String targetKey)   {
        Node p = temp.head;
        while(p != null && !(p.listing.name.equals(targetKey)))  {
            p = p.head;
        }
        if (p != null)  {
            return p.listing;
        }
        else return null;
    }

    public boolean insert(Listing newListing)   {
        Node n = new Node();
        if (n == null)  {
            return false;
        }
        else {
            n.head = temp.head;
            temp.head = n;
            n.listing = newListing;
            return true;
        }
    }
    public boolean delete(String targetKey) {
        Node q = temp;
        Node p = temp.head;
        while (p != null && !(p.equals(targetKey))) {
            q = p;
            p = p.head;
        }
        if(p != null)   {
            q.head = p.head;
            return true;
        }
        else return false;
    }

    public boolean update(String targetKey, Listing newListing) {
        if (delete(targetKey) == false) {
            return false;
        }
        else if (insert(newListing) == false)   {
            return false;
        }
        return true;
    }
}
