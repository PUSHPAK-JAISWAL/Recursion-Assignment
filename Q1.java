// Q1 : Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

import java.util.*;

public class Q1 {
    // Recursive function to find the sum of digits of a number
    static int sumOfDigits(int n) {
        // Base case: if the number is less than 10, return the number itself
        if (n < 10) {
            return n;
        }
        // Recursive case: return the last digit of the number plus the sum of the remaining digits
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The sum of the digits is: " + sumOfDigits(n));
    }
}
