package Javapaid.Hashings;

import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India",100);
        System.out.println(map);

        int populatio = map.get("India");
        System.out.println(populatio);

        System.out.println((map.containsKey("indo")));
    }
}
