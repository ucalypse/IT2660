/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
public class LinkedList {
    public Node head;
    int count;


    public LinkedList() {
        head= null;
    }

    public Listing fetch(String targetKey)   {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("No Records to fetch");
            System.exit(0);
        }
        while(currentNode != null) {
            if (currentNode.listing.name.equals(targetKey))    {
            return currentNode.listing;
            }
            currentNode = currentNode.next;
        }
        return currentNode.listing;
    }

    public boolean insert(Listing newListing)   {
        Node newNode = new Node();
        newNode.listing = newListing;
        Node currentNode = head;

        if (head == null)   {
            head = newNode;
            return true;
        }
       while(currentNode.next != null)
       {
           currentNode = currentNode.next;
        }
        currentNode.next = newNode;
         return false;
    }
//    public boolean delete(String targetKey) {
//        Node q = temp;
//        Node p = head;
//        while (p != null && !(p.listing.name.equals(targetKey))) {
//            q = p;
//            p = head;
//        }
//        if(p != null)   {
//            head = p.head;
//            return true;
//        }
//        else return false;
//    }

//    public boolean update(String targetKey, Listing newListing) {
//        if (delete(targetKey) == false) {
//            return false;
//        }
//        else if (insert(newListing) == false)   {
//            return false;
//        }
//        return true;
//    }
    public void showAll()   {
        Node temp;
        temp = head;
        while(temp != null) {
            System.out.println(temp.listing.toString());
            temp = temp.next;
        }
    }
}
