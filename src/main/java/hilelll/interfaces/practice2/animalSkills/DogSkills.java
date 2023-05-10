package hilelll.interfaces.practice2.animalSkills;

import hilelll.interfaces.practice2.animalSkills.premitiveSkills.*;

public interface DogSkills extends eat, drink, voice, jump, lie, sleep, go, stand, hunt, serve, smellTrace {
    String introduceMyself = "I am a Dog"; // it is constant (final)
    default void waitMaster(){
        System.out.println("I miss you, my master");
    }
    static void staticMethod(){
        System.out.println("It is static method");
    }
}
