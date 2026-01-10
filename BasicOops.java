class Student{
    int id;
    String name;
    void studentData(){
        System.out.println(id+"  "+name);
        System.out.println("Thankyou.");
    }
}
class Main{
    public static void main(String[]args){
        Student s1=new Student();
        s1.id=1;
        s1.name="Soumya";
        s1.studentData();
    }
}



//Encapsulation- Datahiding
class Account{
    private int balance=5000;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int ammount){
        balance = ammount;
    }
}
class AccountMain{
    public static void main(String[]args){
        Account ac=new Account();
        ac.setBalance(7000);
        System.out.println(ac.getBalance());
    }
}