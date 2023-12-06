package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheAns {
    public static void main(String[] args) {
        int key=1,capacity =2;
        LRUCache obj = new LRUCache(capacity);
        int param_1 = obj.get(key);
        obj.put(key,1);
    }
    static class LRUCache {
        private Map<Integer,Node> cache;
        private int capacity;
        private  Node left;
        private  Node right;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<>();

            //left = LRU , right = most recent
            this.left = new Node(0, 0);
            this.right = new Node(0, 0);
            this.left.next = this.right;
            this.right.prev = this.left;
        }

        public int get(int key) {
            if (cache.containsKey(key)){
                remove(cache.get(key));
                insert(cache.get(key));
                return cache.get(key).val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)){
                remove(cache.get(key));
            }
            cache.put(key,new Node(key,value));
            insert(cache.get(key));
            if (cache.size() > capacity) {
                // remove from the list and delete the LRU from the hashmap
                Node lru = this.left.next;
                remove(lru);
                cache.remove(lru.key);
            }
        }

        //remove node
        public void remove(Node node){
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        //insert node at right-most recent
        public void insert(Node node){
            Node prev = this.right.prev;
            Node next = this.right;

            prev.next = node;
            next.prev = node;

            node.next = next;
            node.prev = prev;
        }

        class Node {
            int key;
            int val;

            Node next;
            Node prev;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
    }
}
