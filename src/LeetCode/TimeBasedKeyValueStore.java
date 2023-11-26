package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {
    public static void main(String[] args) {
        String key, value;
        int timestamp;
        TimeMap obj = new TimeMap();
        obj.set("foo","bar",1);
        String param_2 = obj.get("foo",1);
        System.out.println(param_2);
    }
}
class TimeMap{

   // HashMap<String, TreeMap<Integer,String>> timeMp = new HashMap<>();
//    List<Value> valueBank = new ArrayList<>();
//    String lastSmall;
    public TimeMap() {
        //timeMp = new HashMap<>();
    }
    HashMap<String, List<Pair>> map = new HashMap<>();
    public void set(String key, String value, int timestamp) {
//        valueBank.add(value,timestamp);
//        if (!timeMp.containsKey(key)){
//            timeMp.put(key,new TreeMap<Integer,String>());
//        }
//        timeMp.get(key).put(timestamp,value);
        List<Pair> curr = map.get(key);

        if (curr == null) {
            curr = new ArrayList<>();
            map.put(key, curr);
        }

        Pair pair = new Pair();
        pair.timestamp = timestamp;
        pair.value = value;

        curr.add(pair);
    }
    public String get(String key, int timestamp) {
        List<Pair> list = map.get(key);

        if (list == null) {
            return "";
        }

        int low = 0;
        int high = list.size() - 1;

        if (list.get(low).timestamp > timestamp) {
            return "";
        }

        if (list.get(high).timestamp <= timestamp) {
            return list.get(high).value;
        }

        while (low < high) {
            int mid = (low + high) / 2;

            Pair node = list.get(mid);

            if (node.timestamp == timestamp) {
                return node.value;
            }

            if (node.timestamp > timestamp) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return list.get(low - 1).value;
    }
}

//    public String get(String key, int timestamp) {
//        if (!timeMp.containsKey(key)){
//            return "";
//        }
//        TreeMap<Integer,String> temp = timeMp.get(key);
//        Integer t = temp.floorKey(timestamp);
//        if (t==null) {
//            return "";
//        }
//        return temp.get(t);
//    }

//}
class Pair {
    String value;
    int timestamp;
}
//
//    public String getVal() {
//        return val;
//    }
//
//    public void setVal(String val, int time) {
//        this.val = val;
//        this.time = time;
//    }

