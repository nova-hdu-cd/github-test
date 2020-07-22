package com.tuya.demo.daily0619;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 最近最少使用算法
 *
 * @author chendong
 * @date 2020/6/19 5:35 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class LRU<K, V> {

    private LinkedHashMap<K, V> map;

    private int cacheSize;

    private static final float factor = 0.75f;

    public LRU(int cacheSize) {
        this.cacheSize = cacheSize;
        int cap = (int) Math.ceil(cacheSize / factor) + 1;
        map = new LinkedHashMap<K, V>(cap, factor, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > LRU.this.cacheSize;
            }
        };
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void clear() {
        map.clear();
    }

    public synchronized int usedSize() {
        return map.size();
    }

    public void print() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + "\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU<String, String> lru = new LRU<String, String>(3);
        lru.put("k1", "v1");
        lru.put("k2", "v2");
        lru.put("k3", "v3");
        lru.put("k1", "v1");
        
        System.out.println(lru.get("k1"));
        lru.print();
    }

}
