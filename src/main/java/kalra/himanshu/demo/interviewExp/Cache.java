package kalra.himanshu.demo.interviewExp;

import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
public class Cache <K,V> {

    private final long capacity;
    EvictionStrategy evictionStrategy;

    private final Map<K, V> cacheMap;

    private long size = 0;

    public Cache(long capacity, EvictionStrategy evictionStrategy) {
        this.capacity = capacity;
        this.cacheMap = new ConcurrentHashMap<>();
        this.evictionStrategy = evictionStrategy;
    }

    public V set(K key, V value) {
        if (!cacheMap.containsKey(key)) {++size;}
        return evictionStrategy.evictIfNeededAndInsert(cacheMap, key, value, capacity, size);
    }

    public V get(K key) {
        evictionStrategy.rearranceIfNeeded(cacheMap, key);
        return cacheMap.get(key);
    }

}
