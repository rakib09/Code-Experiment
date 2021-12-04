package others;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Naveen", 123);
        map.put("Peter", 21);
        map.put("Tom", 43);
        map.put("Lisa", 55);
        map.put("Robby", 47);
        map.put(null, 76);
        map.put(null, 99);
        map.put("Hasan", null);
        map.forEach((s, integer) -> System.out.println(s + " " + integer));

    }
}
