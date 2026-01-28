/*Method	                Use
length()	        Length of string
charAt(i)	        Character at index
toUpperCase()	    Convert to uppercase
toLowerCase()	    Convert to lowercase
equals()	        Compare strings
equalsIgnoreCase()	Ignore case
substring()	        Extract part
contains()	        Check word
replace()	        Replace characters*/



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