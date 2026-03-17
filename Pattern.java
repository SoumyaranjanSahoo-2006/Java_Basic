import java.util.Scanner;




// Write a Java program to print a horizontal pattern of 5 stars using a loop.
class Pattern{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            System.out.print(" *");
        }
    }
}


/* Write a Java program to print the following pattern using nested loops:

*****
*****
*****
*****
*****    */
class pattern2{
    public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
		    System.out.println();
		}
	}

}


/* Write a Java program to print the following hollow square star pattern using nested loops:
*****
*   *
*   *
*   *
*****     */
class HollowSquare{
    public static void main(String[] args) {
	    for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

/* Write a Java program to print the following pattern (square with principal diagonal) using nested loops:

*****
**  *
* * *
*  **
*****    */

class PrincipalDiagonal {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 1 || i == 5 || j == 1 || j == 5 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/* Write a Java program to print the following pattern (square with anti-diagonal) using nested loops:


*****
*  **
* * *
**  *
*****        */

class AntiDiagonal {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 1 || i == 5 || j == 1 || j == 5 || i + j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/* Write a Java program that takes the number of rows as input from the user and prints a square pattern with both diagonals and borders.

Example Input:


Enter number of row-
9


Output:

*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*********  */



class DigonalScanner {
    public static void main(String[] args) {
        System.out.println("Enter number of row- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n || i + j == n + 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




/* Output
*****
****
***
**
*            */


class DemoPattern {

    public static void main(String[] args) {

        System.out.println("Enter the number of row: ");
        int n = new Scanner(System.in).nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
