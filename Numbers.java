/*  Write a Java program to find all the divisors of a given number.

Example:
Input:
36 → 1, 2, 3, 4, 6, 9, 12, 18, 36
28 → 1, 2, 4, 7, 14, 28         */

import java.util.Scanner;

class PrintDivisor {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
    }
}

