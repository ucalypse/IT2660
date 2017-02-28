/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
public class LinkedList {
    private Node h;

    public LinkedList() {
        h = new Node();
        h.key="";
        h.next= null;
    }

    public Listing fetch(String targetKey)   {
        Node p = h.next;
        while(p != null && !(p.key.equals(targetKey)))  {
            p = p.next;
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
            n.next = h.next;
            h.next = n;
            n.listing = newListing;
            return true;
        }
    }
    public boolean delete(String targetKey) {
        Node q = h;
        Node p = h.next;
        while (p != null && !(p.equals(targetKey))) {
            q = p;
            p = p.next;
        }
        if(p != null)   {
            q.next = p.next;
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
