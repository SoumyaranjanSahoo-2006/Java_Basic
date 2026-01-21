import java.util.Scanner;
class Students{
    int id;
    String name;
    void studentData(){
        System.out.println(id+"  "+name);
        System.out.println("Thankyou.");
    }
}
class Main{
    public static void main(String[]args){
        Students s1=new Students();
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


/* Create a class Student with name and rollNo.
Input values and display them. */


class Student{

    String name;
    int rollNo;
   public void display(){
    System.out.println("Student name is "+name);
    System.out.println("Student rollNo is "+rollNo);
   } 
}

class StudentMain{
    public static void main(String[]args){
        Student s1=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        s1. name=sc.nextLine();
        System.out.println("Enter your RollNo:");
        s1.rollNo=sc.nextInt();
        s1.display();
    }
}


/* Create a class Employee with id and salary.
Create two objects and display both. */

class Employee{
    String id;
    int salary;
    public void employeeDetails(){
        System.out.println("The ID of the employee is "+id);
        System.out.println("The Salary of the employee is "+salary);
    }
}
class EmployeeMain{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Employee e1= new Employee();
        System.out.println("Enter Emplooye id: ");
        e1.id=sc.nextLine();
        System.out.println("Enter salary: ");
        e1.salary=sc.nextInt();
        e1.employeeDetails();
    }
}

/* Create a class Book with title and author.
Write a method to show book details. */


class Book{
    String titel="Srimadd Bhagabata Gita";
    String author="Jagatnatha Dash";
    public void bookDetails(){
        System.out.println("the titel of the book is "+titel);
        System.out.println("the author  of this book is "+author);
    }
}
class BookMain{
    public static void main(String[]args){
        Book b1=new Book();
        b1.bookDetails();
    }
}


/*Create a class Person with a constructor
 that initializes name and age.*/

class Person{
    String name;
    int age;
    Person( String name, int age){
        this.name=name;
        this.age=age;
    }
}

/*Write a program where constructor prints
"Object Created Successfully".*/

class Created{
    
    Created(){
        System.out.println("Object Created Successfully.");
    }

    public static void main(String[]args){
        Created c1=new Created();

    }
}

/* Create a Rectangle class with 
constructor to calculate area. */

class Rectangle{
    
    int length;
    int width;
    int area;

    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
        area= length*width;
    }

    public static void main(String[]args){
        Rectangle r1= new Rectangle(10,5);
        System.out.println("Area of the rectangle is "+r1.area);
    }
}

/*LEVEL 3: Encapsulation (IMPORTANT)
Create a class BankAccount
balance should be private
Use getBalance() and setBalance() */

class BankAccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
}

class BankMain{
    public static void main(String[]args){
        BankAccount b1= new BankAccount();
        b1.setBalance(50000);

        System.out.println("Your Account Balanceis "+b1.getBalance());
    }
}




//! Create a class Login
//! private username and password
//! set and get them safely


class Login{
    private String username;
    private String password;

    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword( String password){
        if(password.length()>=6){
            this.password=password;
        }
        else{
            System.out.println("Password must be at least 6 characters");
        }
    }
    public String getPassword(){
        return "Sorry Password is Hidden";
    }
}

class LoginMain{
    public static void main(String[]args){
        Login log=new Login();

        log.setUsername("Soumyaranjan");
        log.setPassword("Somu1");

        System.out.println("Username: "+log.getUsername());
        System.out.println("Password: "+log.getPassword());

    }
}


// LEVEL 4: Inheritance

/*Create Vehicle class → Bike class
Print bike details.*/

class Vehicle{
    String brand;
    int speed;

    public void vehicleDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("speed: "+speed);
    }
}
class Bike extends Vehicle{
    String model;
    public void bikeDetails(){
        vehicleDetails();
        System.out.println("Model: "+model);
    }
}
class VehicleMain{
    public static void main(String[]args){
        Bike b1=new Bike();
        b1.brand="Hero";
        b1.speed=100;
        b1.model="Splender";
        b1.bikeDetails();
    }
}





/*Create Person class → Student class
Add extra property course.*/

class Person1{
    String name;
    int age;
    public void personDetails(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
class Student1 extends Person1{
    String course;
    public void studentDetails(){
        personDetails();
        System.out.println("Course is "+course);
    }
}
class Student1Main{
    public static void main(String[]args){
        Student1 s1=new Student1();
        s1.name="Soumya";
        s1.age=20;
        s1.course="B-tech(CSE)";
        s1.studentDetails();

    }
}



// LEVEL 5: Polymorphism
// Method Overloading

// Create a class Calculator

// add(int, int)

// add(int, int, int)

// Method Overriding

// Create Shape class with method draw()
// Override it in Circle class.

// 🔰 LEVEL 6: Abstraction

// Create an abstract class Bank with abstract method getInterestRate()
// Implement it in SBI class.

// Create an abstract class Vehicle
// Implement start() in Car and Bike.

// 🔰 LEVEL 7: Interface (Basic)

// Create interface Printable
// Implement it in Document class.

// Create interface Payment
// Implement in UPI class.

// 🔥 MINI OOPS CHALLENGE (VERY IMPORTANT)

// Create a Student Management System using:

// Class & Object

// Constructor

// Encapsulation

// Menu driven program