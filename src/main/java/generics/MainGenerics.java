package generics;

public class MainGenerics {
    public static void main(String[] args) {
        VariableSum printable = new VariableSum<>();
        printable.sum(1, 3);
        printable.sum(1.4, 3.3);
        printable.sum("try to ", " print");
        printable.sum(1, "2");
        VariableSum <Integer,Integer,String> printableInteger = new VariableSum<>();
        System.out.println(printableInteger.sum(1, 3));
        VariableSum <String,String,String> printableString = new VariableSum<>();
        System.out.println(printableString.sum("try to ", "concat it ;))"));
        VariableSum <Double,Double,String> printableDouble = new VariableSum<>();
        System.out.println(printableDouble.sum(4.777, 23.32342));
    }
}
