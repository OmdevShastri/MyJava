package LeetCode;

import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {

    }
    class Solution {
        public int lastStoneWeight(int[] stones) {
            Queue<Integer> q= new PriorityQueue<>(Comparator.reverseOrder());

            for (int stone : stones) {
                q.add(stone);
            }
            while (q.size()>1){
                int l1 = q.poll();
                int l2 = q.poll();

                if (l2!=l1){
                    q.add(l1-l2);
                }
            }
            return !q.isEmpty() ? q.poll() : 0;
        }
    }
}
