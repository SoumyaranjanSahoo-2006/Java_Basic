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


//inheritance-parent,child
class Animal{
    void eat(){
        System.out.println("Eating--");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking--");
    }
}

class MainAnimal{
    public static void main(String[]args){
        Dog dg=new Dog();
        dg.bark();
        dg.eat();
    }
}


/* Create a class Car with variables brand and price.
Create an object and print details. */

class Car{
    String brand= "Audi";
    int price= 100000;
    public static void main(String[]args){
        Car c1= new Car();
        System.out.println(c1.brand);
        System.out.println(c1.price);
    }
}