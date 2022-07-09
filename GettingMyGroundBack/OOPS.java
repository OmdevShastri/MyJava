    package GettingMyGroundBack;

    class Pen{
        String color;
        String type; //ballpoint, gel

        public void write(){
            System.out.println("Writing something");
        }
        public void prtColour(){
            System.out.println(this.color);
        }
    }
    class Shape{
        String color;
        public void area(){
            System.out.println("Displays area");
        }
        public void prtDet(){
            System.out.println(color);
        }
    }
    class Triangle extends Shape{ //Inheritance - for reusability //This was single level inheritance
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Shape{ //Hierarchial inheritance
        public void are(int r){
            System.out.println((3.14)*r*r);
        }
    }

    class EquilateralTriangle extends Triangle{ //Multilevel inheritance
        public void area(int l){
            System.out.println(1/2*l*l);
        }
    }
    class Student{
        String name;
        int age;

        public void prtDetails(String name){     //Function overload
            System.out.println(name);
            }
            public void prtDetails(int age){
                System.out.println(age);
            }
            public void prtDetails(String name, int age){
                System.out.println(name+" "+age);
            }
    //    Student(String name, int age){
    //        System.out.println("Call for contructor");
    //        this.name= name;
    //        this.age=age;
        Student(Student s2){
            System.out.println("Call for contructor");
            this.name= s2.name;
            this.age=s2.age;
            }
            Student(){

            }
            //Destructors are not needed as there is a garbage collector in Java.
    }

    public class OOPS {
        public static void main(String [] args){
//            Pen pen1= new Pen();
//            pen1.color="blue";
//            pen1.type="gel";
//
//            pen1.write();
//
//            Pen pen2 =new Pen();
//            pen2.color="black";
//            pen2.type="ballpoint";
//            pen1.prtColour();
//            pen2.prtColour();
//
//            Student s1 = new Student();
//            s1.name = "Omdev";
//            s1.age = 21;
//
//            Student s2= new Student(s1);
//
//            s2.prtDetails();
            //Polymorphism - more towards compile time
            Student s1 = new Student();
            s1.name = "Omdev";
            s1.age = 21;
            s1.prtDetails(s1.age);

            Triangle t1 = new Triangle();
            t1.color ="red";

        }
    }
