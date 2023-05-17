package hilelll.javaDoc;

/**
 * @author Jemm
 * @version 1.0
 * @since 0.0
 * @see OtherClass#otherMethod()
 * to master javadoc
 * <bold>Main</bold>
 */
public class Main {
//     * Format of java doc:
//     *          /**
//     *          */

    // Annotations
    //          @param          for describing parameters
    //          @throws         for describing exceptions
    //          @author         author
    //          @version        version
    //          @deprecated     deprecated
    //          @see            link to Class#Method or another description
    //                          or link {@link OtherClass#OtherMethod}
    //
    //
    //
    //
    //
    //



    /**
     * I write my
     * java doc
     */
    public static void main(String[] args) {
        /**
         * Here i describe field: String name
         */
        String name;
    }

    /**
     * This demo method do nothing
     * @param string accept string
     * @param number accept int
     * @throws NullPointerException
     * @return aBoolean
     */

     public boolean someMethod(String string, int number) throws NullPointerException{
        boolean aBoolean = true;
        return aBoolean;
    }
}
