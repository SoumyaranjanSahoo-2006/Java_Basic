class Number{
    public static void main(String[]args){
        int n;
        for(n=1;n<=5;n++){
            System.out.println(n);
        }
    }
}
//git num date- 08.01.26


// for reverse of number
class Reverse{
    public static void main(String[]args){
        int n;
        for(n=5;n>=1;n--){
            System.out.println(n);
        }
    }
}


// for even number
class Even{
    public static void main(String...args){
        int n;
        for(n=1;n<=10;n++){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}

//Print odd numbers from 1 to N
// Input: 10 → Output: 1 3 5 7 9

class Odd{
    public static void main(String...odd){
        int n;
        for(n=1;n<=10;n++){
            if(n%2!=0){
                System.out.println(n);
            }
        }
    }
}
