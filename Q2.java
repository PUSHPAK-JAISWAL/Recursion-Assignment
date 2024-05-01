// Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
// Input 2 : n = 5
// Output 2 : 3

import java.util.*;

public class Q2 {
    // Recursive function to find the sum of natural numbers till n with alternate signs
    static int sum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: if n is even, subtract n from the sum of previous numbers
        // If n is odd, add n to the sum of previous numbers
        return ((n % 2 == 0) ? -1 : 1) * n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The sum of natural numbers till " + n + " with alternate signs is: " + sum(n));
    }
}
