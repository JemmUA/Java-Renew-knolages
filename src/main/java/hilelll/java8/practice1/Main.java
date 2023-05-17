package hilelll.java8.practice1;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Map.*;

public class Main {
    public static void main(String[] args) {
/*
// Ordered Map
        List<Map.Entry<Integer, String>> orderedTuples = new ArrayList<>();
//        Map.Entry<Integer, String> tuple = new AbstractMap.SimpleEntry<>(1,"one");
        orderedTuples.add(new AbstractMap.SimpleEntry<>(1,"one"));
        orderedTuples.add(new AbstractMap.SimpleEntry<>(2,"two"));
        orderedTuples.add(new AbstractMap.SimpleEntry<>(3,"three"));
        orderedTuples.add(new AbstractMap.SimpleEntry<>(4,"four"));
        orderedTuples.add(new AbstractMap.SimpleEntry<>(5,"five"));
        System.out.println(orderedTuples);
        System.out.println(orderedTuples.get(4));

        // Set<Map.Entry<K, V>>  HashMap<K, V>
        Map<Integer, String> mapFromSet = orderedTuples.stream()
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        System.out.println(mapFromSet);

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(5,"five");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.put(4,"four");
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
*/

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"one");
        treeMap.put(2,"two");
        treeMap.put(3,"three");
        treeMap.put(4,"four");
        treeMap.put(5,"five");
        System.out.println(treeMap);
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.firstEntry());
    }
}
