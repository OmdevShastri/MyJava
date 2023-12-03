package LeetCode;

public class MergeKSortedLists {
    public static void main(String[] args) {

    }

    class Solution {
//        public ListNode helper(ListNode list1, ListNode list2){
//            if (list1 == null)return list2;
//            if (list2 == null)return list1;
//
//            if (list1.val< list2.val){
//                list1.next = helper(list1.next, list2);
//                return list1;
//            }else {
//                list2.next = helper(list2.next, list1);
//                return list2;
//            }
//        }

        public ListNode mergeKLists(ListNode[] lists) {
            int size = lists.length;;
            if (lists == null || size == 0) {
                return null;
            }
            if(size==1){return lists[0];}
            int interval =1;

            while (interval<size){
                for (int i = 0; i < size-interval; i+=2*interval) {
                    lists[i] = merge(lists[i],lists[i+interval]);
                }
                interval *=2;
            }
            return size>0 ? lists[0] :null;
        }

        public ListNode merge(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    curr.next = l1;
                    l1 = l1.next;
                } else {
                    curr.next = l2;
                    l2 = l2.next;
                }
                curr = curr.next;
            }
            if (l1 != null) {
                curr.next = l1;
            } else {
                curr.next = l2;
            }
            return dummy.next;
        }

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
