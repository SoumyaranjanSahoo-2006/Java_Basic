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