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