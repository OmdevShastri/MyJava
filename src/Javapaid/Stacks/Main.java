package Javapaid.Stacks;

//import Javapaid.Stacks.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        StackArrayList s = new StackArrayList();
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//
//        StackLinkedL sl = new StackLinkedL();
//        sl.push(1);
//        sl.push(2);
//        sl.push(3);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
