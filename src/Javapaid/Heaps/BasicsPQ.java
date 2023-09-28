package Javapaid.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicsPQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A",1));//O(logn)
        pq.add(new Student("B",10));
        pq.add(new Student("C",14));
        pq.add(new Student("D",6));
        pq.add(new Student("E",3));
        while (!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
