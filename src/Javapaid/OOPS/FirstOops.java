package Javapaid.OOPS;

public class FirstOops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAcc myAcc = new BankAcc();
        myAcc.username = "omdev";
        myAcc.setPassword("asd");
        System.out.println();

        Student st1 = new Student("omdev");
//        System.out.println(st1.name);
//        Student st2 = new Student();
//        Student st3 = new Student(22);
        st1.rollno = 11;
        st1.pass = "pass123";
        st1.marks[0]= 100;
        st1.marks[1]= 90;
        st1.marks[2]= 90;

        Student st2 = new Student(st1);
        st2.pass = "pass231";
        st1.marks[2]= 80;

        for (int i = 0; i < 3; i++) {
            System.out.println(st2.marks[i]);
        }


    }
}

class BankAcc{
    public String username;
    private String password;

    void setPassword(String password) {
        this.password = password;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int rollno;
    String pass;
    int marks [];

    //Shallow copy constructor
//    Student(Student s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollno = s1.rollno;
//        //this.pass = s1.pass;
//        this.marks = s1.marks;
//    }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]= s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("some constructor...");
    }
    Student(int rollno){
        marks = new int[3];
        this.rollno = rollno;
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
}