package Javapaid.LinkedLists;


public class RemoveNthFromEnd extends LinkedList{
    public void deleteNthFromEnd(int n){
    //calc size
        int sz=0;
        Node temp = head;
        while (temp !=null){
            temp = temp.next;
            sz++;
        }

        if (n ==sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i< iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    public static void main(String[] args) {
        RemoveNthFromEnd l1 = new RemoveNthFromEnd();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.addFirst(6);

        l1.prtLL();
        l1.deleteNthFromEnd(3);
        l1.prtLL();

    }
}
