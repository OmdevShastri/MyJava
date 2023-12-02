package LeetCode;

import java.util.*;

class MedianFinder {
    //my solution

//    PriorityQueue<Integer> list;
//    public MedianFinder() {
//        list = new PriorityQueue<>();
//    }
//
//    public void addNum(int num) {
//        list.add(num);
//    }
//
//    public double findMedian() {
//
//        int size = list.size();
//
//        if ((size)%2 ==0){
//            double sum = 0.0;
//
//            for (Integer n :
//                    list) {
//                sum += n;
//            }
//            return sum / size;
//        }
//
//        //return list.get((size)/2);
//        return list.(size/2);
//    }
//
//    public static void main(String[] args) {
//        MedianFinder obj =new MedianFinder();
//
//        obj.addNum(-1);
//        System.out.println(obj.findMedian());
//        obj.addNum(-2);
//        System.out.println(obj.findMedian());
//        obj.addNum(-3);
//        System.out.println(obj.findMedian());
//        obj.addNum(-4);
//        System.out.println(obj.findMedian());
//        obj.addNum(-5);
//        System.out.println(obj.findMedian());
//    }


    //improved
    //2 heaps, large and small which are minHeap and maxHeap respectively
    //Heaps should be of equal size
    private Queue<Integer> smallHeap;
    private Queue<Integer> largeHeap;
    public MedianFinder() {
        smallHeap = new PriorityQueue<>(Comparator.reverseOrder());
        largeHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        smallHeap.add(num);
        if (
                smallHeap.size() - largeHeap.size() > 1 ||
                        !largeHeap.isEmpty() &&
                                smallHeap.peek() > largeHeap.peek()
        ) {
            largeHeap.add(smallHeap.poll());
        }
        if (largeHeap.size() - smallHeap.size() > 1) {
            smallHeap.add(largeHeap.poll());
        }
    }

    public double findMedian(){
        if (smallHeap.size()== largeHeap.size()){
            return (double) (largeHeap.peek()+smallHeap.peek())/2;
        }else if (smallHeap.size()> largeHeap.size()){
            return smallHeap.peek();
        }else {
            return (double) largeHeap.peek();
        }
    }
    public static void main(String[] args) {
        MedianFinder obj =new MedianFinder();

        obj.addNum(-1);
        System.out.println(obj.findMedian());
        obj.addNum(-2);
        System.out.println(obj.findMedian());
        obj.addNum(-3);
        System.out.println(obj.findMedian());
        obj.addNum(-4);
        System.out.println(obj.findMedian());
        obj.addNum(-5);
        System.out.println(obj.findMedian());
    }
}