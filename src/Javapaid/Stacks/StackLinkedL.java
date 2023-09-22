package Javapaid.Stacks;

public class StackLinkedL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head =null;
    public static boolean isEmpty(){
        return head == null;
    }

    //push
    public static void push(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop
    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }
}
