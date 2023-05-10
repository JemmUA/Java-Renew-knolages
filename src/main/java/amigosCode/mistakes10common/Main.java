package amigosCode.mistakes10common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
//        Iterator<String> stringIterator = words.iterator();
//        while (stringIterator.hasNext()) {
//            String word = stringIterator.next();
//            if (word.equals("d")) {
//                words.remove(word);
//            }
//        }
        System.out.println(words.iterator());

//        Iterator<String> stringIterator = words.iterator();
//        System.out.println(stringIterator.next());
//        System.out.println(stringIterator.next());
//        System.out.println(stringIterator.next());
//        System.out.println(stringIterator.next());
        words.forEach(System.out::println);

//        String str = "str";
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
//        Optional<String> opt2 = Optional.empty();
        System.out.println(opt.orElse("where is my string?"));
    }
}
