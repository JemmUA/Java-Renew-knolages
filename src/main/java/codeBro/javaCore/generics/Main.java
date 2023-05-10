package codeBro.javaCore.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // generics =   enable types (classes and interfaces) to be parameters when definingJ
        //              classes, interfaces and methods
        //              a benefit is to eliminate the need to create multiply versions
        //              of methods or classes for various data types.
        //              Use 1 version for all reference data types

        // bounded types =  you can creat the objects of a generic class to have data
        //                  of specific derived types ex. Number (a extends Number)


//        Integer[] intArray = {1, 5, 34, -2, 100};
//        Double[] doubleArray = {2.1, 6.2, 22.77, 1.1};
//        Character[] charArray = {'H', 'i', 'a', 'b', 'c', 'd', 'e', 'q', 'f'};
//        String[] stringArray = {"B", "Y", "E"};
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);


        MyGenerics<Integer,Integer> intG = new MyGenerics<>(1);
        MyGenerics<Double,Double> doubleG = new MyGenerics<>(1.1);
        MyGenerics<Boolean,Integer> booleanG = new MyGenerics<>(true);
        MyGenerics<Character,Float> charG = new MyGenerics<>('C');
        MyGenerics<String,Byte> strG = new MyGenerics<>("String");

        MyGenerics<String, String> strings = new MyGenerics<>("first", "second");
        System.out.println(strings.getAll()[0]);
        System.out.println(strings.getAll()[1]);

        ArrayList<String> friends = new ArrayList<>();
        HashMap<String,String> coworkers = new HashMap<>();

        System.out.println(intG.getA());
        System.out.println(doubleG.getA());
        System.out.println(charG.getA());
        System.out.println(strG.getA());
    }

//
//    public static void displayArray(Integer[] array) {
//        for (Integer value : array) {
//            System.out.println(value);
//        }
//    }
//    public static void displayArray(Double[] array) {
//        for (Double value : array) {
//            System.out.println(value);
//        }
//    }
//    public static void displayArray(Character[] array) {
//        for (Character value : array) {
//            System.out.print(value);
//        }
//        System.out.println();
//    }
//    public static void displayArray(String[] array) {
//        for (String value : array) {
//            System.out.print(value);
//        }
//    }
//
    public static <A> void displayArray(A[] array) {
        for (A value : array) {
            System.out.print(value);
        }
        System.out.println();
    }
}
