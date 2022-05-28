import java.util.HashMap;
import java.util.Map;

public class HashMap_Practice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //<키 자료형, 값 자료형>

        map.put("A", 100);
        map.put("B", 90);
        map.put("C", 80);
        map.put("D", 70);

        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        System.out.println(map.get("D"));
        System.out.println("-----------------------------");
        if(!map.containsKey("A")) {
            map.put("A", 200);
        }

        //map.putIfAbsent("A",300);

        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println("-----------------------------");

        for(String key:map.keySet()) { //keySet() : 모든 키를 순회
            System.out.println(map.get(key));
        }

    }
}
