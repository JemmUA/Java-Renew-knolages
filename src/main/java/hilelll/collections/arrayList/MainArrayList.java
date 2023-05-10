package hilelll.collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
//        ArrayList
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        arrayList2.add("Hello");
        arrayList2.add("Bye");
        arrayList.addAll(arrayList2);
        arrayList.add(arrayList2);
//        arrayList.clear();
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Hello"));

//        String[] str = new String[33];
//        System.out.println(str.length);
        String[] strs = {"sds", "sds", "sds", "sds"};
        System.out.println(strs.length);
        System.out.println(strs[3]);
        // List
        List<Integer> integers = new ArrayList<>();
        List strings = arrayList;
        System.out.println(arrayList);
        System.out.println(strings.contains("Hello"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.indexOf("Bye"));
        System.out.println(strings.get(4));

        // Map

        //Set

        //Collection
        Collection<String> strings1 = arrayList;
        while (strings1.iterator().hasNext()) {
            System.out.println(strings1.iterator().next());
            strings1.iterator().next();
        }
    }
}
