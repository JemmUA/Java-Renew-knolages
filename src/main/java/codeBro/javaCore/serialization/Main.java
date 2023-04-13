package codeBro.javaCore.serialization;

public class Main {
    public static void main(String[] args) {
        //  Serialization = The process of converting an object into byte stream.
        //                  Persists (save the state) the object after program exits
        //                  This byte stream can be saved as file or sent over a network
        //                  Can be sent to a different machine
        //                  Byte stream can be saved as a file (.ser) which is platform independent
        //                  (Think of this as if you are saving a file with the objects's information)

        //  Deserialization = The reverse process of converting a byte stream into an object.
        //                  (Think of this as if you are loading a saved file)


        //          Step of serialize
        //          -------------------------------------------------
        //          1. Your object class should implement Serializable interface
        //          2. add import java.io.Serializable;
        //          3. FileOutputStream fileOut = new FileOutputStream(file path)
        //          4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //          5. out.writeObject(objectName);
        //          6. out.close(); fileOut.close();
        //          -------------------------------------------------
    }
}
