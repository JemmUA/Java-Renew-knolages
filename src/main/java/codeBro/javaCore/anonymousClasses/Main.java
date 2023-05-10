package codeBro.javaCore.anonymousClasses;

public class Main {
    /*
    * Anonymous classes =   an inner class without name
    *                       only a single is created from one
    *                       The object may have "extras" of "changes"
    *                       and no need to create a separate inner class
    *                       when it only need it once.
    *                       Helps us to avoid cluttering code with a class name
    *
    *                       Syntax is similar to constructor,
    *                       except that there is also a class definition
    *                       within a block of code.
    *                       GREAT FOR LISTENER
    * */

    public static void main(String[] args) {
        Greetings greetings0 = new Greetings();

        Greetings greetings = new Greetings(){
            @Override
            public void welcome(){
                System.out.println("Hello new world!");
            }

        };
        greetings0.welcome();
        greetings.welcome();

        // Example (project))

        MyFrame myFrame = new MyFrame();
        myFrame.setTitle("Anonymous classes");


    }

}
