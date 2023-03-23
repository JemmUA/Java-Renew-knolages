package interfaceII;

public class Main {
    public static void main(String[] args) {
        System.out.println(Activity.var);
        System.out.println(Man.var);
        Activity.sayHello();
        Man man = new Man();
        man.say("I am a man");
        man.work();
        man.doSports();
        man.shout("I am a man!!!!!!!!!!!!!!");
        man.haveRest();
        Activity.sayHelloThreeTimes();
//        MyInterface.var = "change var"; // CONSTANT
        Child child = new Child();
        child.jump();
        child.work();
        child.doSports();
        child.say("Hi baby))");
        child.shout("Mooooooom!!!");
        Doll doll = new Doll();
        doll.work();
        doll.jump();
        doll.conflict();
        doll.conflictOld();
        doll.conflictNew();
    }

}

