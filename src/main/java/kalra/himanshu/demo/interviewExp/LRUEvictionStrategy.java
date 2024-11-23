//package kalra.himanshu.demo.interviewExp;
//
//import lombok.RequiredArgsConstructor;
//
//import java.util.*;
//
//@RequiredArgsConstructor
//public class LRUEvictionStrategy <K,V> implements EvictionStrategy{
//
//    //map -> Node
////    Map<K, DataNode> keyTolistLastNodeMap = new HashMap<>();
//
//    Map<K, Boolean> keyMap = new LinkedHashMap<>();
//
////    LinkedList<DataNode> list = new LinkedList<>();
//
//    @Override
//    public <V, K> void rearranceIfNeeded(Map<K, V> cacheMap, K key) {
//        if (!cacheMap.containsKey(key)) {
//            return;
//        }
//        // check for key -> node
//        keyMap.remove(key);
//        keyMap.put(key, true);
//    }
//
//    @Override
//    public <K, V> V evictIfNeededAndInsert(Map<K, V> cacheMap, K key, V value, long capacity, long size) {
//        if (size<capacity && !cacheMap.containsKey(key)) {
//            keyMap.put(key, Boolean.TRUE);
//            return cacheMap.put(key, value);
//        }
//        if (size>=capacity) {
//            rearranceIfNeeded(cacheMap, key);
//            return cacheMap.put(key, value);
//        }
//        removeFirstElement(cacheMap);
//        return cacheMap.put(key, value);
//    }
//
//    private <K, V> void removeFirstElement(Map<K,V> cacheMap) {
//    }
//
//}
