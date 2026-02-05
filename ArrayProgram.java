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

//! Arrays.to String() ---

class DemoToString{
    public static void main(String[]args){
        int a[]={10,20,30,40,50};
        String res=Arrays.toString(a);
        System.out.println(res);
    }
}


//! WAJP to update an element at given index.

class UpdateElement{
    public static void main(String[]args){
        int a[]={2,6,8,9,0,4};
        System.out.println(Arrays.toString(a));
        m1(a,4,3);
        System.out.println(Arrays.toString(a));
    }
    static void m1(int a[],int index,int newElement){
        a[index]=newElement;
    }
}

//! WAJP toupdate value off an array with new gven value. i/p- {3,2,1,4,3,5,4}, old value=3,new value=10 .

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


//! WAJP to arrange the element in sequence. i/p={1,5,3,7,4,6,10,9},o/p={1,3,4,5,6,7,9,10}

class ArrangeElement{
    public static void main(String[]args){
        int a[]={1,5,3,7,4,6,10,9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}


// class ArrangeElement2{
//    public static void main(String[]args){
//         int a[]={1,5,3,7,4,6,10,9};
//         arrange(a);
       
//     }
//     static void arrange(int a[]){
//         Arrays.sort(a);
//         for(int i=0;i<a.length;i++){
//             if(a[i]-1!=a[i-1]){
//                 System.out.println(a[i]-1);
//             }
//         }
//     } 
// }


//! WAJP to insert an element at last of an array.

class InsertValue{
    public static void main(String[]args){
        int a[]={8,5,4,9,6,2,7};
        int b[]=new int[a.length+1];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[a.length]=1;
        a=b;
        System.out.println(Arrays.toString(a));
    }

}


//! WAJP to find the all even number of an array.
class ArrayEven{
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int temp:a){
            if(temp%2==0){
                System.out.println(temp);
            }
        }
    }
}

//! WAJP to print all the prime number of an array.

class ArrayPrime{
    public static void main(String[]args){
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        for(int temp:a){
            if(isPrime(temp)){
                System.out.println(temp);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1) return false
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        return count==2;
    }
}