//! Write a java program to find sum of all element from an array or by using variable argument method.

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