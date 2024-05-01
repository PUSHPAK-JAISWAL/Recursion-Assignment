// Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].

import java.util.*;

public class Q4 {
    
    static int sum(int[] a, int i) {
        
        if (i == a.length) {
            return 0;
        }
        
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Sum of array values is: " + sum(a, 0));
    }
}
