package Javapaid.OOPS;

public class InterfacesStudy {
    public static void main(String[] args) {
    Bear b = new Bear();
       b.eats();
    }
}

interface Chessplayer{
    void moves();
}

interface Herbivore{
    void eats();
}
interface Carnivore{
    void eats();
}

class Bear implements Herbivore, Carnivore{
    public void eats() {
        System.out.println("both meat and plants");
    }
}


class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right by one step");
    }
}