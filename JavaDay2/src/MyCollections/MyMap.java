package MyCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {
    private HashMap<String, String> map;

    public MyMap(HashMap<String, String> map) {
        this.map = map;
    }

    public void insert(String key, String value) {
        map.put(key, value);
    }

    public void printMap() {
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("===== Map contents =====");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void printMap(HashMap<String, List<Double>> map) {
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
