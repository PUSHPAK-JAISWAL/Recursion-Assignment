// Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

import java.util.*;

public class Q3 {
    // Recursive function to find the maximum value in an array
    static int max(int[] a, int i, int m) {
        if (i == a.length) {
            return m;
        }
        if (a[i] > m) {
            m = a[i];
        }
        return max(a, i + 1, m);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Max value is: " + max(a, 0, Integer.MIN_VALUE));
    }
}
