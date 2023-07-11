package Javapaid.OOPS;

public class SuperKeyword {

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class AnimalC{
    String color;
    AnimalC(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends AnimalC{
    Horse(){
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}