package hilelll.java9To17.practice2;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // var

//        var pen = new Pen("red") {
//            void breakDown() {
//                System.out.println("break down");
//            }
//        };
//        pen.breakDown();
        Pens pena = new Pens() {
            @Override
            public void eraser() {
                System.out.println("I erase soft");
            }

            public void eraser(boolean doErase) {
                System.out.println("I erase soft");
            }

            @Override
            public String toString() {
                return "$classname{}";
            }
        };

        pena.eraser();
        System.out.println(pena);
//        System.out.println(pen);

        var aStr = "var string";
        var aInt = 100; // primitive
        System.out.println(aStr.toUpperCase());
        System.out.println(aInt + 200);
        System.out.println(aStr instanceof String);
        System.out.println((Integer) aInt instanceof Number);

        // 'Elvis' operator. Checks not null object
        // class Objects
        String elvis = null;
        String checkNonNullVar = Objects.requireNonNullElse(elvis, "Elvis ran away");
        System.out.println(checkNonNullVar);


        //Switch
        String variable = "two";
        switch (variable) {
            case "one" -> System.out.println(variable);
            case "two" -> System.out.println(variable.repeat(2));
        }


        int digit = 1;
        String res = switch (digit) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            default:
                throw new IllegalStateException("what you mean? : " + digit);
        };

        System.out.println(res);


        // Text block
        String textBlock = """
                
                lots, lots,
                loooooots of 
                text
                            """;
        System.out.println(textBlock);

//        Record controlPanel = new Record("button 1", "button 2", 12);

//        if (pen instanceof Pen castedPen) {
//            System.out.println("yes");
//        }


// Sealed classes: non-sealed, sealed, permits



    }



}
