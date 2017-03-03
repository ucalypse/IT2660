/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due March 9, Spring 2017
Chapter 4 Exercise 27
 */
public class LinkedList {
    public Node head;

    public LinkedList() {
        head= null;
    }
//fetch method
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
        System.out.println("No Records found");
        System.exit(0);
        return new Listing("",0,0);
    }
//insert
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
    public boolean delete(String targetKey) {
        Node currentNode = head;
        Node previousNode = null;

        if (head == null)   {
            System.out.println("No Students In List");
            return false;
        }
        while(currentNode != null)
        {//nested if to detect all possible node deletions
            if(currentNode.listing.name.equals(targetKey))  {
                if(previousNode == null)    {
                    head = currentNode.next;
                    break;
                }
                else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return true;
    }

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
            System.out.println("Name: " + temp.listing.name + "\n" + "ID: " + temp.listing.id + "\n" + "G.P.A: " + temp.listing.gpa + "\n");
            temp = temp.next;
        }
    }
}
