package hilelll.stream.practicre2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // Create steam
    /*
     * Empty stream:             Stream.empty();
     * Stream from collection:   collection.stream();
     * Stream from map:          map.entrySet.stream();
     * Stream from array:        Arrays.stream(array);
     *
     * Stream from
     * defined elements:         Stream.of("first", "second", "third");
     *                           IntStream.of(1, 2, 3);
     *                           LongStream.of(2L,4L,7l);
     *                           DoubleStream.of(1.1, 2.1, 3.33);
     * */

    // Lazy Methods
    /*
    *   .filter() // predicate
    *   .sorted() // comparator
    *   .skip(n)
    *   .limit(m)
    *   .distinct()
    *   .mapToInt(v -> Long.parseInt(v))        // map to int
    *   .mapToDouble(v -> Long.parseDouble(v))    // map to double
    *   .mapToLong(v -> Long.parseLong(v))      // mao to long
    */

    // Eager methods
    /*
    * .findFirst()                      // get optional
    * .findAny()                        // get optional
    * .collect(Collectors.toLIst());    // get collection
    * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // collect to map
    *
    * .count();                         // get int
    * .anyMatch();                      // predicate get boolean
    * .noneMatch();                     // predicate
    * .allMatch();                      // predicate
    * .forEach();                       // consumer
    * */

    // MultiThreads
    /*
    *   collection.parallelStream();
    *   collection.stream().parallel();
    * */
    public static void main(String[] args) {
        String[] arrayStr = {"zero","one","two","three","four", "five","six","seven","eight", "nine"};
        List<Integer> listInt = List.of(0,1,2,3,4,5,6,7,8,9);
        Map<Integer, String> map = new HashMap();
        for (int i=0; i<arrayStr.length; i++) map.put(listInt.get(i),arrayStr[i]);
        System.out.println(map);
        System.out.println(map.entrySet());



        Stream emptyStream = Stream.empty();
        Stream<Integer> listStream = listInt.stream();




/*
        Stream<Map.Entry<Integer,String>> mapCollection = map.entrySet().stream();
        mapCollection
                .peek(System.out::println)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
*/


//        Map<Integer,String> mapCollection = map.entrySet().stream()
//                .peek(System.out::println)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);



     /*   System.out.println("MORSE CODE");
        final String[][] morseArray = {
                {"A", ".-  "}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.. "}, {"E", "."}, {"F", "..-."},
                {"G", "--. "}, {"H", "...."}, {"I", "..  "}, {"J", ".---"}, {"K", "-.- "}, {"L", ".-.."},
                {"M", "--  "}, {"N", "-.  "}, {"O", "--- "}, {"P", ".--."}, {"Q", "--.-"}, {"R", ".-. "},
                {"S", "... "}, {"T", "-   "}, {"U", "..- "}, {"V", "...-"}, {"W", ".-- "}, {"X", "-..-"},
                {"Y", "-.--"}, {"Z", "--.."}};
        HashMap<String, String> morseMap = new HashMap<>();
        for (String[] strings : morseArray) morseMap.put(strings[0], strings[1]);

        Stream<Map.Entry<String, String>> morseStream = morseMap.entrySet().stream();
        Map<String, String> morseCollection =
                morseStream
                        .peek(System.out::println) // print as is
//                .peek(mapN -> System.out.println(mapN.getKey() + "=" + mapN.getValue())) // print in custom style
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));*/

    }


}
