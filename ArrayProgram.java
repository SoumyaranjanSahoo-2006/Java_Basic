import java.util.Arrays;


//! 1. Write a java program to find sum of all element from an array or by using variable argument method.

class SumOfAllElement{
    public static void main(String[]args){
        int a[]={20,50,80,40};
        int res=m1(a);
        System.out.println(res);
    }
    static int m1(int...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}


//! 2. WAJP to find sum of all even number and multiplication of al odd  number in a array.

class AllEvenOdd{
    public static void main(String[]args){
        m1(1,2,3,4,5,6,7,8,9);
    }

    static int m1(int...a){
        int sum=0;
        int multiplay=1;
        for(int temp:a){
            if(temp%2==0){
                sum+=temp;
            }
            else{
                multiplay*=temp;
            }
        }
        System.out.println("sum "+sum+", multiplication "+multiplay);
        return sum;
    }
}

