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
class Student{
    String name;
    int age;

    public void prtDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String [] args){
        Pen pen1= new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();

        Pen pen2 =new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.prtColour();
        pen2.prtColour();


    }
}
