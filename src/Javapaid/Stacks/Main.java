package Javapaid.Stacks;

//import Javapaid.Stacks.*;
import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.*;

public class Main {

    private static void pushAtBottom(Stack<Integer> s, int data) { //O(n)
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while (idx< str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);

    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
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
//        pushAtBottom(s, 4);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//        String str = "Hello";
//        System.out.println(reverseStr(str));

        //printStack(s);
        reverseStack(s);
        printStack(s);
    }


}
