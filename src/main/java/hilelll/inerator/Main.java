package hilelll.inerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Make collection
        String[] names ={"Alla","Mikola","Bob","Ken","Kim","John"};
        List<String> names2 = List.of("Alla","Mikola","Bob","Ken","Kim","John");
        ArrayList<String> names3 = new ArrayList<>(Arrays.asList("Alla","Mikola","Bob","Ken","Kim","John"));
        ArrayList<String> names4 = new ArrayList<>(List.of(names));

        // Iterator
        Iterator<String> iteratorNames = names3.iterator();
        while (iteratorNames.hasNext()){
            System.out.println(iteratorNames.next());
        }
    }
}
