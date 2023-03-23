package generics;

public class VariableSum<X, Y, A> {

    private A a;
//    private X x;
//    private Y y;

    public A sum(X x, Y y) {
        if (x instanceof Integer && y instanceof Integer) {
            a = ((A) (String.valueOf((int) x + (int) y)));
            return (A) String.valueOf(a);
        }
        if (x instanceof Double && y instanceof Double) {
            a = ((A) (String.valueOf((double) x + (double) y)));
            return (A) String.valueOf(a);
        }
        if (x instanceof String && y instanceof String) {
            a = ((A) ((String) x).concat((String) y));
            return (A) a;
        }
        System.out.println("parameters don't match to types");
        return null;
    }


}
