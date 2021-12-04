package hash.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronousVsConcurrent {
    public static void main(String[] args) {
        //Synchronous hash map --> allow null value & key
        Map<String, String> synMap = Collections.synchronizedMap(new HashMap<>());
        experimentNullValues(synMap);

        //hash map --> allow null value & key
        Map<String, String> map = new HashMap<>();
        experimentNullValues(map);

        //ConCurrent hash map --> Don't allow null value & key
        Map<String, String> conMap = new ConcurrentHashMap<>();
        experimentNullValues(conMap);
    }

    private static void experimentNullValues(Map<String, String> map) {
        try {
            System.out.println(map.getClass());
            map.put("a", "null");
            map.put("a", null);
            map.put(null, "a");
            map.put(null, null);
            map.put(null, null);
            map.put(null, null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
