/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
public class LinkedList {
    Node temp;
    Node head;
    Node tail;
    int count;


    public LinkedList() {
        temp = new Node();
        head= null;
        tail = null;
        temp.next = null;
    }

//    public Listing fetch(String targetKey)   {
//        Node node = head;
//        while(node != null && !(node.listing.name.equals(targetKey)))  {
//            node = head;
//        }
//        if (node != null)  {
//            return node.listing;
//        }
//        else return null;
//    }

    public boolean insert(Listing newListing)   {
        Node newNode = new Node();
        if(count == 0) {
            tail = newNode;
        }
            head = newNode;
            newNode.next = null;
            newNode.listing = newListing;
            count ++;
            return true;
        }
    }
    public boolean delete(String targetKey) {
        Node q = temp;
        Node p = head;
        while (p != null && !(p.listing.name.equals(targetKey))) {
            q = p;
            p = head;
        }
        if(p != null)   {
            head = p.head;
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
    public void showAll()   {
        while(temp != null)    {
            System.out.println(temp.listing.toString());
        }
    }
}
