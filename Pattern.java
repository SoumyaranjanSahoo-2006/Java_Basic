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

