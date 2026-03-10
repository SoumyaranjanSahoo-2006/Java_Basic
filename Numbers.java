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


/* Write a Java program to print all divisors of a number and calculate the sum of all divisors using an optimized approach (up to √n).
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
6
sum= 91     */

class SumOfDivisor {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                sum += i;
                System.out.println(i);

                if(n / i != i) {
                    System.out.println(n / i);
                    sum = sum + (n / i);
                }
            }
        }

        System.out.println("sum= " + sum);
        sc.close();
    }
}



/* Write a Java program to print the following number pattern using nested loops:

1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5       */
class NumberPattern{
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
