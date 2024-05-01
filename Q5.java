// Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
// of every digit in that number raised to the power of total digits in that number is equal to the number.
// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
// Input1 : 153
// Output1 : Yes
// Input 2 : 134
// Output2 : No

import java.util.*;

public class Q5 {
    static int power(int n, int r) {
        int p = 1;
        for (int c = 1; c <= r; c++) {
            p = p * n;
        }
        return p;
    }

    static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = 0, remainder;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }
        return n == sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        if (isArmstrong(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
