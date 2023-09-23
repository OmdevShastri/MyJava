package Javapaid.Queues;

public class QueueArrayCircular {
    static int[] arr;
    static int size;
    static int rear;
    static int front;

    QueueArrayCircular(int n){
        arr = new int[n];
        size =n;
        rear=-1;
        front =-1;
    }

    public static boolean isEmpty(){
        return rear ==-1 && front == -1;
    }

    public static boolean isFull(){
        return (rear+1)%size ==front;
    }

    //add
    public static void add(int data){
        if (isFull()){
            System.out.println("Is full");
            return;
        }
        if (front ==-1){
            front =0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    //remove
    public static int remove(){
        if (isEmpty()){
            System.out.println("Is Empty");
            return -1;
        }

        int result = arr[front];

        //one left last ele delete
        if (rear==front){
            rear = front=-1;
        }else {
            front =(front+1)%size;
        }
        return result;
    }

    //peek
    public static int peek(){
        if (isEmpty()){
            System.out.println("Is Empty");
            return -1;
        }
        return arr[front];
    }
}
