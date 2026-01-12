package hashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> hash = new HashMap<>();
        hash.put("ankush", 100);
        hash.put("aniket", 55);
        hash.put("anurag", 65);
        hash.put("abhishek", 53);
        hash.put("abhinav", 35);
        hash.put("abhijeet", 64);
        hash.put("ankit", 34);
        System.out.println(hash.get("ankush"));
        System.out.println(hash);
        hash.remove("aniket");
        System.out.println(hash);
        System.out.println(hash.containsKey("ankush"));
        System.out.println(hash.putIfAbsent("ankus", 222));
        System.out.println(hash);
        hash.entrySet();
    }
}
