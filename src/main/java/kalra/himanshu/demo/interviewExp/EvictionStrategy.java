package kalra.himanshu.demo.interviewExp;

import java.util.Map;

public interface EvictionStrategy {


    <V, K> void rearranceIfNeeded(Map<K,V> cacheMap, K key);

    <K, V> V evictIfNeededAndInsert(Map<K,V> cacheMap, K key, V value, long capacity, long size);
}
