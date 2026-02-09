//! Find the leader elements in of an array.The elements the bigger than all list right side element in array 
//!        eg- i/p-[17,18,5,4,6,1]
//!            o/p-18,6,1

import java.util.Arrays;
class TextDemo{
    public static void main(String[]args){
        int a[]={17,18,5,4,6,1};

    }
    static void m1(int...a){
        for(int i=0;i<=a.length;i++){
            if(a[i]%2==0){
                System.out.println();
            }
        }
    }
}



//! Wtite a program, wher the given input is sorted aray a[],and a key.find out sum of any two element.
//! same as given key or not .if possible return true other wise return false;
//!         ip-[1,2,3,4,5,6,7,8] key=14
//!         op- true, because 6+8=14



class Sorted{
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8};
    }
}





class ArrayPrime{
    public static void main(String[]args){
        int a[]= {1,2,3,4,5,6,7,8,9};
        for(int temp:a){
            if(isPrime(temp)){
                System.out.println(temp);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        return count==2;
    }
}




class UpdateValue{
    public static void main(String[]args){
        int a[]={3,2,1,4,3,5,4};
        System.out.println(Arrays.toString(a));
        m1(a,10,3);
        System.out.println(Arrays.toString(a));
    }
    static void m1(int a[],int newValue,int oldValue){
        for(int i=0;i<a.length;i++){
            if(a[i]==oldValue){
                a[i]=newValue;
            }
        }
    }
}




//! write a program, where the given input  String is pangram or not.
//! Astringis known as panagram if it contains all the character of  english alphabate.


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

