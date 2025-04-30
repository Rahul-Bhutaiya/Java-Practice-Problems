package Hashing.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRU_Cache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRU_Cache<String, Integer> studentMap = new LRU_Cache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Bob", 100);
        studentMap.put("Vipul", 89);


        System.out.println(studentMap);
    }
}