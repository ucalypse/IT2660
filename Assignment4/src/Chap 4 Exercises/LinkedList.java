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
            return null;
        }
        while(currentNode != null) {
            if (currentNode.listing.name.equals(targetKey))    {
            return currentNode.listing;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
//insert
    public boolean insert(Listing newListing)   {
        Node newNode = new Node();
        newNode.listing = newListing;
        Node currentNode = head;
//Checking if there is a item in the list already
        if (head == null)   {
            head = newNode;
            System.out.println(newNode.listing.name + " inserted successfully");
            return true;
        }
       while(currentNode.next != null)
       {
           currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        System.out.println(newNode.listing.name + " inserted successfully");
         return false;
    }
    //delete method
    public boolean delete(String targetKey) {
        Node currentNode = head;
        Node previousNode = null;

        if (head == null)   {
            return false;
        }
        while(currentNode != null)
        {//nested if to detect all possible node deletions
            if(currentNode.listing.name.equals(targetKey))  {
                if(previousNode == null)    {
                    head = currentNode.next;
                    System.out.println(targetKey + " deleted successfully");
                    break;
                }
                else {
                    previousNode.next = currentNode.next;
                    System.out.println(targetKey + " deleted successfully");
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return true;
    }

    public boolean update(String targetKey, Listing newListing) {
       Node currentNode = head;
       if(head == null) {
           return false;
       }
       while(currentNode != null)   {
           if (currentNode.listing.name.equals(targetKey))  {
               currentNode.listing.name = newListing.name;
               currentNode.listing.id = newListing.id;
               currentNode.listing.gpa = newListing.gpa;
               System.out.println(targetKey + " updated successfully to " + currentNode.listing.name + "\n");
           }
           currentNode = currentNode.next;
       }
       return true;
    }
    public void showAll()   {
        Node temp;
        temp = head;
        while(temp != null) {
            System.out.println("Name: " + temp.listing.name + "\n" + "ID: " + temp.listing.id + "\n" + "G.P.A: " + temp.listing.gpa + "\n");
            temp = temp.next;
        }
    }
}
