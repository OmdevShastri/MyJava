package Javapaid.LinkedLists;

//import Javapaid.LinkedLists.LinkedList.*;

public class IsLLPalindrome extends LinkedList{

    public Node findMid(Node Head){
        Node slow = head;
        Node fast = head;

        while (fast !=null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }

        return slow;
    }

    public boolean checkPalin(){
        if (head == null || head.next == null){
            return true;
        }
        // find mid
        Node midNode = findMid(head);
        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //compare left and right
        while (right != null){
            if (left.data !=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        IsLLPalindrome l1 = new IsLLPalindrome();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(2);

        System.out.println(l1.checkPalin());


    }
}
