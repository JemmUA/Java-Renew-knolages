package hilelll.collections.practice1.hw11remake.entity;

import java.util.*;

public class InitializationData {
    public Information fillCollections(Information information) {
//        List<String> nicknames = information.getNicknames();
//        Set<String> emails = information.getEmails();
//        Map<String, String> emailNickname = information.getEmailNickname();

        List<String> nicknames = new ArrayList<>();
        Set<String> emails = new HashSet<>();
        Map<String, String> emailNickname = new HashMap<>();

        nicknames.add("Alex");
        nicknames.add("Ben");
        nicknames.add("Bob");

        emails.add("alex@mail.ua");
        emails.add("ben@mail.ua");
        emails.add("bobx@mail.ua");

        emailNickname.put("Alex", "alex@mail.ua");
        emailNickname.put("Ben", "ben@mail.ua");
        emailNickname.put("Bob", "bobx@mail.ua");

        information.setNicknames(nicknames);
        information.setEmails(emails);
        information.setEmailNickname(emailNickname);

        for (int i = 0; i < 10; i++) {
            nicknames.add("Adam");
        }

        for (int i = 0; i < 10; i++) {
            emails.add("adam@mail.ua");
        }

        for (int i = 0; i < 10; i++) {
            emailNickname.put("Adam", "adam@mail.ua");
        }

        information.setNicknames(nicknames);
        information.setEmails(emails);
        information.setEmailNickname(emailNickname);
//
//        System.out.println(information.getNicknames().size());
//        System.out.println(information.getEmails().size());
//        System.out.println(information.getEmails().size());

//        System.out.println(information.getNicknames());
//        System.out.println(information.getEmails());
//        System.out.println(information.getEmails());
        checkSize(information);
        return information;
    }

    private Information checkSize(Information information) {

        information.setNicknames(new ArrayList<>(new HashSet(information.getNicknames())));

        if (information.getNicknames().size() == information.getEmails().size() &&
                information.getEmails().size() == information.getEmailNickname().size()) {
            System.out.println("Collections are equal");
        }
        return information;
    }
}
