/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due February 23, Spring 2017
Chapter 3 Exercise 21
 */
public class Stack {
    private int[] data = new int[0];

    //    public Stack(int n) {
//        top = -1;
//        size = 100;
//        data = new String[n];
//    }
    public boolean push(int target) {
        int[] tempArray = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            tempArray[i] = data[i];
        }
        tempArray[tempArray.length - 1] = target;
        data = tempArray;
        return true;
    }

    public void showAll() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public int pop() {
        int poppedValue = data[data.length-1];
        int[] tempArray = new int[data.length - 1];
        for (int i = 0; i < data.length-1; i++) {
            tempArray[i] = data[i];
        }
        data = tempArray;
       return poppedValue;
    }

}

