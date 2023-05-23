package hilelll.multiThread.synchroCollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        // Collections for multi thread
        // Old approaches, unrecommended to use
        List<String> stringList = Collections.synchronizedList(new ArrayList<String>());
        Set<String> stringSet = Collections.synchronizedSet(new HashSet<String>());
        Map<String, String> stringMap = Collections.synchronizedMap(new HashMap<String, String>());

        // Recommended approach
        // import java.util.concurrent.*;
        Map<Object, Object> map = new ConcurrentHashMap<>();
        List<Object> list = new CopyOnWriteArrayList<>();
        Set<Object> set = ConcurrentHashMap.newKeySet();


    }
}
