package interfaceII;

public class Man implements Activity, SuperActivity{
    @Override
    public void shout(String shout) {

        Activity.super.shout(shout);
        SuperActivity.super.shout(shout);
    }

    @Override
    public void doSports() {
        System.out.println("I do sports");
    }

    @Override
    public void haveRest() {
        System.out.println("I have a rest");
    }

    @Override
    public void work() {
        System.out.println("I work");
    }
}
