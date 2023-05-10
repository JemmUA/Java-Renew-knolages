package hilelll.generics.widcards;

import hilelll.generics.widcards.entity.Admin;
import hilelll.generics.widcards.entity.SuperAdmin;
import hilelll.generics.widcards.entity.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Wildcards
        //                  PECS
        // Producer Extends  || Consumer Super
        // <? extends Class> || <? super Class>

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<SuperAdmin> superAdmins = new ArrayList<>();

        superAdmins.add(new SuperAdmin());
        users.add(new Admin());
        admins.add(new SuperAdmin());

        collectionsSuper(admins);
        collectionsSuper(users);
        collectionsExtends(admins);
        collectionsExtends(superAdmins);
    }

    public static void collectionsSuper(ArrayList<? super Admin> clients) {
        clients.add(new Admin());
    }

    public static void collectionsExtends(ArrayList<? extends Admin> clients) {
//        clients.add(new User()); // for extends - addition RESTRICTED
    }
}
