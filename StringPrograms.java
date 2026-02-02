/*Method	                Use
length()	        Length of string
charAt(i)	        Character at index
toUpperCase()	    Convert to uppercase
toLowerCase()	    Convert to lowercase
equals()	        Compare strings
equalsIgnoreCase()	Ignore case
substring()	        Extract part
contains()	        Check word
replace()	        Replace characters
concat()            merge two string  
trim()              used to remove space*/


//! reverse a String

class Reverse{
    public static void main(String[]args){
        String word="Java";
        String reverse="";
        for(int i= word.length()-1;i>=0;i--){
            reverse+= word.charAt(i);
        }
        System.out.println(reverse);
    }
}


//! Check Palindrome
//Write a Java program to check whether a string is palindrome or not.
class Palindrome{
    public static void main(String...args){
        String s="madam";
        String rev="";
        for(int i= s.length()-1;i>=0;i--){
            rev+=s.charAt(i); 
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" Not a Palindrome");
        }
    }
}


//! WAJP if a string is palindrome show true other wise show false.

class Palindrome1{
    public static void main(String[]args){
        String word="malayalam";
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String s){
        if(s.length()==0) return true;
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse= reverse+s.charAt(i);
        }
        return s.equals(reverse);
    }
}