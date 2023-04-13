package codeBro.javaCore.arrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("cyan");
        colors.add("blue");
        colors.add("violet");

        for (String color : colors) {
            System.out.println(color);
        }

        printColors("red", "green");
    }

    static void printColors(String ... colors) {
        System.out.println("\n| colors:\n");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
