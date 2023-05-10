package hilelll.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // methods of String:
        //      .length();
        //      .toCharArray();
        //      .trim();
        //      .strip(); // from java 11 (work with Unicode)
        //      .stripLeading();
        //      .stripTrailing();
        //      .isEmpty();
        //      .isBlank(); // visual check
        //      .substring();
        //      .charAt();
        //      .contains();
        //      .indexOf(); // -1 if absent
        //      .valueOf()
        //      .concat();
        //      .equals();
        //      .equalsIsIgnoreCase();
        //      .toLowerCase();
        //      .toUpperCase();
        //      .repeat();
        //      .lines(); // stream of strings

        // with REGEX
        //      .matches();
        //      .split();
        //      .replaceAll();

        // PATTERN
        //      Pattern pattern = Pattern.compile("regex",flag);
        //      Matcher matcher = pattern.matcher("input");
        //      boolean found = matcher.matches();
        //      boolean found = matcher.find();


              Pattern pattern = Pattern.compile("regex");
              Matcher matcher = pattern.matcher("input");
              boolean match = matcher.matches();
              boolean found = matcher.find(2);
        System.out.println(match);
        System.out.println(found);


        String str = "Hello world world hello hello".replaceAll("hello", "hi");
        String[] split = str.split(" ", 2);
        System.out.println(split.length);
        Arrays.stream(split).forEach(System.out::print);
//        System.out.println("example".matches("example"));
//        System.out.println("example".matches("example"));
//        System.out.println("\"     \".isBlank(): "+"     ".isBlank());
//        System.out.println("\"     \".isEmpty(): "+"     ".isEmpty());
//        String myString = new String(" \t Hello");
//        System.out.println(myString.trim());
//        System.out.println(myString.strip());
//        char[] chM= myString.toCharArray();
//        System.out.println(chM);
//        String stringOfChM = chM.toString();
//        System.out.println(myString.contains("ll"));
//        System.out.println(myString.substring(1,4));
//        System.out.println(myString.substring(3));
//        System.out.println(myString.subSequence(3,5));
//        CharSequence ss = myString.subSequence(3,5);
//        System.out.println(myString.charAt(0));
//        System.out.println(myString.indexOf("l"));
//        System.out.println(myString.indexOf('l'));
//        System.out.println(String.valueOf(false));

//        System.out.println("   ".isEmpty());
//        System.out.println("   ".isBlank());
//        System.out.println(myString.toLowerCase());
//        System.out.println(myString.toUpperCase());
//        System.out.println(myString.charAt(0));

//        System.out.println((int)'H');
//        System.out.println(myString.codePointAt(0));

//        System.out.println(myString.concat(" world!"));
//        System.out.println(myString.length());
//        System.out.println(myString.lines());
//        System.out.println(myString.toCharArray());
//        System.out.println(myString.contains("H"));


//        System.out.println(myString);
//        System.out.println(myString.equals("Hello"));
//        System.out.println(myString.matches("Hello"));
//        System.out.println(myString.matches("[a-zA-Z]{4,}"));

//        Pattern pattern = Pattern.compile("[a-zA-F]{4,}");
//        Matcher matcher = pattern.matcher("AfJK");
//        System.out.println(matcher.matches());
//        "(((\\+38|8)\s)|)\\(\\d{3}\\)\\s\\d{3}((-|\\s|)\\d{2}){2}"
//        Pattern pattern2 = Pattern.compile("(\\+38|8)\s\\d{3}\s\\d{3}(-|\\s|)(\\d{2}(-|\\s|)){2}");
//        Matcher matcher2 = pattern2.matcher("+38 067 000-00-00");
//        System.out.println(matcher2.matches());


    }

}
