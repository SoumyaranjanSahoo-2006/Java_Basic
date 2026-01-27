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


//To count the digit of number

class CountDigitofEachNumber {
	public static void main(String[] args) {
		int count=0;
		for(int num=1234;num>0;num=num/10) {
			count++;
		}
		System.out.println(count);
	}
}



//To find the sumof the each digit
class SumofEachDigit {
	public static void main(String[] args) {
		int num;
		int sum=0;
		for( num=12345;num>0;num=num/10) {
			int rem=num%10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
