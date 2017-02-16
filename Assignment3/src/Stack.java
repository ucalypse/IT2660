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
    public Stack(int n) {
        top = -1;
        size = 100;
        data = new String[n];
    }
    public boolean push(String target) {
        String newTarget;
        int topLocation;
        if (top == size - 1) {
            return false;
        } else {
            top += 1;
            data[top] = target;
        }
        return true;
    }

}
