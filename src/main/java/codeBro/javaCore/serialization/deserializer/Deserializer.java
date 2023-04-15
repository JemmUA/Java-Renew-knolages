package codeBro.javaCore.serialization.deserializer;

import codeBro.javaCore.serialization.User;

import java.io.*;

public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //  Serialization = The process of converting an object into byte stream.
        //                  Persists (save the state) the object after program exits
        //                  This byte stream can be saved as file or sent over a network
        //                  Can be sent to a different machine
        //                  Byte stream can be saved as a file (.ser) which is platform independent
        //                  (Think of this as if you are saving a file with the objects's information)

        //  Deserialization = The reverse process of converting a byte stream into an object.
        //                  (Think of this as if you are loading a saved file)


        //          Steps to Serialize
        //          -------------------------------------------------
        //          1. Your object class should implement Serializable interface
        //          2. add import java.io.Serializable;
        //          3. FileOutputStream fileOut = new FileOutputStream(file path)
        //          4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //          5. out.writeObject(objectName);
        //          6. out.close(); fileOut.close();
        //          -------------------------------------------------

        //          Steps to Deserialize
        //          -------------------------------------------------
        //          1. Declare your object (not instantiate)
        //          2. Your class should implement Serializable interface
        //          3. add important java.io.Serializable
        //          4. FileInputStream fileIn = new FileInputStream(file path);
        //          5. ObjectInputStream in = new ObjectInputStream(fileIn);
        //          6. objectName = (Class) in.readObject();
        //          7. in.close(); fileIn.close();
        //          -------------------------------------------------

        // important notes  1. Children classes of parent class that implements Serializable will do so as well
        //                  2. static fields are not serialized (they belong the class, not individual object)
        //                  3. the class's definition ("class file") itself is not recorded, cast it as the object type
        //                  4. Fields declared as "transient" aren't serialized, they are ignored
        //                  5. SerialVersionUID is unique version ID

        // serialVersionUID =   serialVersionUID is a unique ID that functions lake a version #
        //                      verifies that the sender and receiver of a serialized object,
        //                      have loaded classes for this object that match
        //                      Ensures object will be compatible between machines
        //                      Number must match. Otherwise this will cause an InvalidClassException
        //                      A SerialVersionUID will be calculated based on class properties, members, etc.
        //                      A serializable class can declare its own serialVersionUID explicitly (recommended)

        User user = null;
        FileInputStream fileIn = new FileInputStream("src/main/java/codeBro/javaCore/serialization/userInfo1.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User)in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.getName());
        System.out.println(user.getPassword());
        user.sayHello();
        System.out.println("Все добре :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+ serialVersionUID);


    }

}
