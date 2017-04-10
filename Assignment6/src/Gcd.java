/*
Donald Davis
IT 2660 Data Structures & Algorithms CRN 13907
Due April 13, Spring 2017
Chapter 6 Exercises 16 & 18
 */
public class Gcd {
    public int findGcd(int num1, int num2)  {
        //if the remainder is 0 it means we have our match
            if (num2==0) return num1;
            //passing the remainder of the 2 numbers back into the method recursively
            else return findGcd(num2, num1 % num2);
    }
}
