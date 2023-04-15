package codeBro.javaCore.serialization;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
//    transient private String password; // if transient for serialization, it must be for deserializable as well

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sayHello(){
        System.out.println("Hello, "+ name);
    }
}
