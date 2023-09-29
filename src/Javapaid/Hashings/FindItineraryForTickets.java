package Javapaid.Hashings;

import java.util.HashMap;

public class FindItineraryForTickets {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String,String> revMap = new HashMap<>();

        for (String key :
                tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for (String key :
                tickets.keySet()) {
            if (!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String st = getStart(tickets);
        System.out.print(st);
        for (String key :
                tickets.keySet()) {
            System.out.print(" -> "+ tickets.get(st));
            st = tickets.get(st);
        }
        System.out.println();
    }
}
