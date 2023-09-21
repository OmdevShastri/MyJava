package Javapaid.LinkedLists;

class LinkedList{
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        size++;
        //step-1 : create new node
        Node newNode = new Node(data);
        if (head ==null){
            head = tail = newNode;
            return;
        }

        //step-2 : newNode next = head
        newNode.next = head; //link

        //step-3 : head = newNode
        head = newNode;
    }

    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if (head ==null){
            head = tail = newNode;
            return;
        }

        //tail next = newNode
        tail.next = newNode;
        tail = newNode;
    }

    public void prtLL(){
        if (head ==null){
            System.out.println("Is empty");
        }

        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if (idx ==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while (i<idx-1){
            temp = temp.next;
            i++;
        }

        //i= idx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size ==0){
            System.out.println("Is empty");
            return Integer.MIN_VALUE;
        } else if (size ==1) {

            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {

            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev = size-2;
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.data;
        prev.next=null;
        tail= prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.prtLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.prtLL();
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.prtLL();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.prtLL();


    }
}

