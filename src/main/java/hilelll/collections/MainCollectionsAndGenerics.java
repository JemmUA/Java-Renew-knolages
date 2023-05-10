package hilelll.collections;

import hilelll.collections.entity.*;

import java.util.*;

public class MainCollectionsAndGenerics {
    public static void main(String[] args) {
//        new ArrayList()
//        new LinkedList<>();// nods
//        new HashSet<>();
//        new HashMap<>();

        List<Integer> listStr = List.of(1,2,3);


        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i * 10);
        }
        System.out.println(linkedList.get(5));

        linkedList.add(5, 2);
        System.out.println(linkedList.get(5));
        linkedList.remove(5);
        System.out.println(linkedList.get(5));


        List arrList = new ArrayList(222);
        System.out.println(arrList.size());
        for (int i = 0; i < 10; i++) {
            arrList.add(i * 10);
        }
        System.out.println(linkedList.get(2));

        arrList.add(3, 111111);
        arrList.add(3, "hilelll/string");
        arrList.add(3, "hilelll/string");
//        for (Object numb:arrList) {
//            System.out.println(numb);
//        }
//        for (int i = 0; i < arrList.size(); i++) {
//            System.out.println(arrList.get(i));
//        }
        System.out.println(arrList);
        arrList.forEach(System.out::println);
        arrList.forEach(x -> System.out.print(x + ", "));
        System.out.println("\b\b");
        System.out.print("arrayList contains string: ");
        System.out.println(arrList.contains("hilelll/string"));
        arrList.removeIf(s -> s.equals("hilelll/string"));

        arrList.add("to tail");
        System.out.println(arrList);


        // HashSet, TreeSet, LinkedHashSet
//        TreeSet<Object> objects = new TreeSet<>();
        HashSet hashSet = new HashSet();

        hashSet.add(1);
        hashSet.add(1);
        hashSet.add("key");
        hashSet.add(true);
        hashSet.add(2);
        System.out.println("hashSet.isEmpty: " + hashSet.isEmpty());
        System.out.print("hashSet.contains key: ");
        System.out.println(hashSet.contains("key"));
        System.out.println("hashSet.size(): " + hashSet.size());
        System.out.println("Iteration");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        hashSet.remove(1);
        System.out.println(hashSet);
//        hashSet.clear();
//        System.out.println(hashSet);
//        System.out.println("hashSet.isEmpty: " + hashSet.isEmpty());

        ArrayList arrayFromSet = new ArrayList(hashSet); // Set to ArrayList
        for (int a = 0; a < arrayFromSet.size(); a++) {
            System.out.println(arrayFromSet.get(a));
        }
        arrayFromSet.add("+");
        arrayFromSet.add("+");
        arrayFromSet.add("+");
        arrayFromSet.add("+");
        Iterator iter = arrayFromSet.iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        HashSet<?> set = new HashSet<>(arrayFromSet); // ArrayList to Set
        System.out.println(set);
        //exercise
        ArrayList<Boots> boots = new ArrayList<>();
        boots.add(new Boots());
        ArrayList<Pants> pants = new ArrayList<>();
        ArrayList<Shirt> shirts = new ArrayList<>();

        // Map
        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put(null, null);
        hashMap.put("Boots", boots);
        hashMap.put("Pants", pants);
        hashMap.put("Shirts", shirts);
        System.out.println("hashMap.size: " + hashMap.size());
        System.out.println("hashMap: " + hashMap);

        System.out.println("\nMap keys: ");
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);

        System.out.println("\nMap values: ");
        Collection<Object> collection = hashMap.values();
        System.out.println(collection);

//        System.out.println(hashMap.get(null));
//        hashMap.remove(null);


        System.out.println("\nEntry map iteration: ");
        Iterator entryIterator = hashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) entryIterator.next();
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }

        System.out.println("\nEntry map iteration 2 (good): ");
        for (Map.Entry<String, Object> stringObjectEntry : hashMap.entrySet()) {
            System.out.println(stringObjectEntry.getKey() + " - " + stringObjectEntry.getValue());
//            System.out.println(stringObjectEntry.hashCode());
        }

        Integer integer = Integer.valueOf("333");
        System.out.println(integer + 444);

        if (integer instanceof Number) {
            System.out.println("ok");
        }

        System.out.println("Numbers: ");
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1L);
        numbers.add(1.1111);
        System.out.println(numbers);

        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("user" + String.valueOf(1 + i)));
        }
//        users.add(new Admin("user"+String.valueOf(11111111)));
//        users.add(new SuperAdmin("user"+String.valueOf(55555)));
        System.out.println(users);
        ArrayList<Admin> admins = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            admins.add(new Admin("admin" + String.valueOf(1 + i)));
        }
//        admins.add(new SuperAdmin("super99"));

        System.out.println(admins);
        ArrayList<SuperAdmin> superAdmins = new ArrayList<>();
        superAdmins.add(new SuperAdmin("super"));
        System.out.println(superAdmins);


        // Generics
        fillList(users);
        fillList(admins);
        fillList(superAdmins);
    }

    public static void fillList(List list) {
//    public static void fillList(List<?> list) {// WILDCARD
//    public static void fillList(List<? extends SuperAdmin> list) { //PRODUCER EXTENDS
//    public static void fillList(List<? super User> list) { //CONSUMER SUPER
        list.add(new User());
        list.add(new Admin());
        list.add(new SuperAdmin());

    }

}

