import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class HashMapMethodsDemo {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and values
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - add key-value pair
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        System.out.println("After put: " + map);

        // 2. putIfAbsent(K key, V value) - add only if key not present
        map.putIfAbsent(2, 250); // won't add because 2 exists
        map.putIfAbsent(4, 400); // adds new key 4
        System.out.println("After putIfAbsent: " + map);

        // 3. get(Object key) - get value for key
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Value for key 5 (not present): " + map.get(5)); // null

        // 4. containsKey(Object key) - check if key exists
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains key 5? " + map.containsKey(5));

        // 5. containsValue(Object value) - check if value exists
        System.out.println("Contains value 200? " + map.containsValue(200));
        System.out.println("Contains value 500? " + map.containsValue(500));

        // 6. size() - number of key-value pairs
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty() - check if map empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 8. remove(Object key) - remove entry by key
        int removedValue = map.remove(1);
        System.out.println("Removed value for key 1: " + removedValue);
        System.out.println("After remove key 1: " + map);

        // 9. remove(Object key, Object value) - remove entry if key maps to value
        boolean removed = map.remove(2, 250);
        System.out.println("Removed (2,250)? " + removed); // false because value is 200
        removed = map.remove(2, 200);
        System.out.println("Removed (2,200)? " + removed);
        System.out.println("After conditional remove (2,200): " + map);

        // 10. replace(K key, V value) - replace value for key
        map.replace(3, 350);
        System.out.println("After replace value for key 3: " + map);

        // 11. replace(K key, V oldValue, V newValue) - replace if current value equals oldValue
        boolean replaced = map.replace(3, 300, 360);
        System.out.println("Replace (3,300) with 360? " + replaced); // false, current value 350
        replaced = map.replace(3, 350, 360);
        System.out.println("Replace (3,350) with 360? " + replaced);
        System.out.println("After conditional replace: " + map);

        // 12. clear() - remove all entries
        HashMap<Integer, Integer> tempMap = new HashMap<>(map);
        tempMap.clear();
        System.out.println("Temp map after clear(): " + tempMap);

        // 13. keySet() - get all keys
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // 14. values() - get all values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // 15. entrySet() - get all key-value pairs as Set of Map.Entry
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        System.out.print("Entries: ");
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.print("[" + entry.getKey() + "=" + entry.getValue() + "] ");
        }
        System.out.println();

        // 16. putAll(Map<? extends K,? extends V> m) - add all entries from another map
        HashMap<Integer, Integer> anotherMap = new HashMap<>();
        anotherMap.put(5, 500);
        anotherMap.put(6, 600);
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // 17. getOrDefault(Object key, V defaultValue) - get value or default if key absent
        System.out.println("Value for key 7 (default 700): " + map.getOrDefault(7, 700));
        System.out.println("Value for key 5 (default 700): " + map.getOrDefault(5, 700));

        // 18. containsKey and containsValue already covered

        // 19. computeIfAbsent(K key, Function) - add new value computed if key absent
        map.computeIfAbsent(7, k -> 700);
        System.out.println("After computeIfAbsent for key 7: " + map);

        // 20. computeIfPresent(K key, BiFunction) - recompute value if key present
        map.computeIfPresent(5, (k, v) -> v + 50);
        System.out.println("After computeIfPresent for key 5: " + map);

        // 21. merge(K key, V value, BiFunction) - merge a value for the key
        map.merge(6, 100, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge for key 6: " + map);

        // 22. forEach(BiConsumer) - iterate using lambda
        System.out.print("Iterating with forEach: ");
        map.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();
    }
}
