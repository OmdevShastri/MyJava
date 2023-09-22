package Javapaid.LinkedLists;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //print
    public void prtDLL(){
        Node temp = head;
        System.out.print("null<-");
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head ==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //addLast

    //removeFirst
    private int removeFirst() {
        if (head ==null){
            System.out.println("Is empty");
            return Integer.MIN_VALUE;
        }
        if (size ==1){
            int val = head.data;
            head= tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //removeLast

    public static void reverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr !=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.prtDLL();
        System.out.println(dll.size);
        //dll.removeFirst();
        dll.reverseDLL();
        dll.prtDLL();
        //System.out.println(dll.size);
    }


}
