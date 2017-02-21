/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 23, Spring 2017
Chapter 3 Exercise 21
 */
public class Stack {
    public String[] data;
    public int top;
    public int size;

    public Stack() {
        top = -1;
        size = 100;
        data = new String[100];
    }
//    public Stack(int n) {
//        top = -1;
//        size = 100;
//        data = new String[n];
//    }
    public boolean push(String target) {
    //    String newTarget;
  //      int topLocation;
        if (top == size - 1) {
            return false;
        } else {
            top += 1;
            data[top] = target;
        }
        return true;
    }
    public void showAll()   {
        for (int i =top; i >= 0; i--)   {
            System.out.println(data[i].toString());
        }
    }
    public int pop()   {
        String[] newArray = new String[data.length - 1];
        String poppedValue = data[data.length - 1];
        for (int i =0; i<newArray.length; i++)  {
            newArray[i] = data[i];
        }
        data = newArray;
        return 0;
    }

}

