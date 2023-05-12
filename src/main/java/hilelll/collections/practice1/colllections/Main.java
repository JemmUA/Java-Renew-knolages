package hilelll.collections.practice1.colllections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList<>();
        List<User> list = new ArrayList<>();
        list.add(new User("Alina"));
        list.add(0, new User("Bob"));
        list.add(2, new User("Bob"));
        list.set(2, new User("Mary"));
//        list.remove(0);
        System.out.println(list);

        HashSet<User> hashSet = new HashSet<>();
        Set<User> set = new HashSet<>();

        HashMap<String, User> hashMap = new HashMap<>();
        Map<String, User> map = new HashMap<>();
        map.put("Alex", new User("Alex"));
        map.put("Bob", new User("Bob"));
        map.put("Ken", new User("Ken"));
        Iterator iteratorKeySetMap= map.keySet().iterator();
        System.out.println("KeySet:");
        while (iteratorKeySetMap.hasNext()) {
            System.out.println(iteratorKeySetMap.next());
        }
        Iterator iteratorEntrySet= map.entrySet().iterator();
        System.out.println("Entry set:");
        while (iteratorEntrySet.hasNext()){
            System.out.println(iteratorEntrySet.next());
        }
        System.out.println(map.keySet());

        Set<String> set2 = new HashSet<>(map.keySet());
        System.out.println(set2);

        List<String> list3 = new ArrayList<>(set2);
        list3.add("Ben");
        list3.add("Kevin");
        list3.add("Enny");
        list3.add("Enny");
        list3.add("Enny");
        System.out.println(list3);
        Set<String> set3 = new HashSet<>(list3);
        System.out.println(set3);
    }
}
