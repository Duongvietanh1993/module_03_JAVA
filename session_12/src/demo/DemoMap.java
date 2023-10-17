package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty() ? "Map đang rỗng" : "Map đang chứa dữ liệu");
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.replace(1, "100");
        map.replace(5, "1000");
        map.remove(2);
        map.remove(1, "1");
        Set<Integer> keySet = map.keySet();
        System.out.println("các cặp key/value của map: ");
        for (Integer key : keySet) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
