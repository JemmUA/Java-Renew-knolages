package collections.arrays;

public class MainArrays {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "warm";
        strArray[1] = "hot";
        strArray[2] = "cold";
        for (String str : strArray) {
            System.out.println(str);
        }

        int[] intArray = {2, 3};
        System.out.println(intArray);
        intArray = addArrayIntValue(32, intArray);
        intArray = addArrayIntValue(323, intArray);

        for (int number : addArrayIntValue(444, intArray)) {
            System.out.println(number);
        }
        Integer[] arrayFirst = new Integer[8];
        System.out.println("arrayFirst length: " + arrayFirst.length);
        System.out.println("arrayFirst[2] "+ arrayFirst[2]);

        Integer[] arraySecond = {1,2,4,5};

        System.out.println("array length: " + arraySecond.length);
        System.out.println("array index 1: " + arraySecond[1]);

        System.arraycopy(arraySecond, 0, arrayFirst, 0, 4);
        System.out.println("arrayFirst.length " + arrayFirst.length);
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.println(arrayFirst[i]);
        }

    }

    static int[] addArrayIntValue(int value, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

}
