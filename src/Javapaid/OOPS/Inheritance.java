package Javapaid.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs=4;
        System.out.println();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
}

//derived
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Yes swims");
    }
}

class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}
class Dogs extends Mammals{
    String breed;
}

class Birds extends Animal{
    void fly(){
        System.out.println("flies");
    }
}