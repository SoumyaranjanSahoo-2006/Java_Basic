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

/*
Write a Java program to print all divisors of a number with improved time complexity.

Example:
36 → 1, 2, 3, 4, 6, 9, 12, 18, 36
28 → 1, 2, 4, 7, 14, 28     */

class PrintDivisor2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}


/* Write a Java program to print all divisors of a number using an optimized approach (up to √n).
Example Output:
Enter a number:
36
1
36
2
18
3
12
4
9
6       */

class DivisorNumber_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
                if(n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}

