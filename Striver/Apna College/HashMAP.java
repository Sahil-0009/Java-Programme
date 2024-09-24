import java.util.*;
import java.util.Map.Entry;

public class HashMAP {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("USA", 100);
        map.put("UK", 80);
        System.out.println(map);

        map.put("USA", 120);
        System.out.println(map);

        // Search /Look up
        if (map.containsKey("USA")) {
            System.out.println("Key is present in the map");

        } else {
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("USA"));
        System.out.println(map.get("China"));

        // Iterator
        // Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        for (Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        map.remove("USA");
        System.out.println(map);
    }
}
