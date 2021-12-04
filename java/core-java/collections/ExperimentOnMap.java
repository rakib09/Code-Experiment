package collections;

import java.util.*;

public class ExperimentOnMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        experimentsMap(map);

        Map<String, Integer> map1 = new LinkedHashMap<>();
        experimentsMap(map1);

        Map<String, Integer> map2 = new TreeMap<>();
        experimentsMap(map2);

        Map<String, Integer> map3 = new TreeMap<>(Collections.reverseOrder());
        experimentsMap(map3);

        NavigableMap<String, Integer> map4 = new TreeMap<>();
        map4.put("A1", 1200);
        map4.put("C1", 100);
        map4.put("B1", 3000);
        map4.put("D1", 200);
        map4.put("F1", 1100);
        map4.put("E1", 1800);
        map4 =map4.descendingMap();
        System.out.println("Experiment on NavigableMap: " + map4.getClass());
        map4.forEach((s, integer) -> System.out.println("Key: " + s + " Value: " + integer));
    }

    private static void experimentsMap(Map<String, Integer> map) {
        System.out.println("Experiment on map: " + map.getClass());
        map.put("A1", 1200);
        map.put("C1", 100);
        map.put("B1", 3000);
        map.put("D1", 200);
        map.put("F1", 1100);
        map.put("E1", 1800);
        map.forEach((s, integer) -> System.out.println("Key: " + s + " Value: " + integer));
    }
}
