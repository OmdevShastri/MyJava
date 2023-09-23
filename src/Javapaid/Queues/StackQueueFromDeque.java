package Javapaid.Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackQueueFromDeque {
    public static class Stack{
        Deque<Integer> d = new LinkedList<>();
        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
    public static class Queue{
        Deque<Integer> q = new LinkedList<>();
        public void add(int data){
            q.addLast(data);
        }
        public int remove(){
            return q.removeFirst();
        }
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        //s.pop();
        System.out.println(s.peek());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        //q.remove();
        System.out.println(q.peek());
    }
}
