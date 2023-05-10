package codeBro.javaCore.innerClasses;

public class Main {
    public static void main(String[] args) {
        /* Inner class =    A class inside another class
         *                   useful if class should be limited in scope.
         *                   Usually private, but not necessary
         *                   Helps group classes that belong together
         *                   Extremely useful for listeners for specific events
         *                   Precursor for anonymous inner classes
         *
         *
         * */

        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        System.out.println(out.getH() + in.getW());
        in.greetings();
        out.outsMet();


    }
}
