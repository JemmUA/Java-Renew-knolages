package hilelll.collections.practice1.hw11remake;

import hilelll.collections.practice1.hw11remake.entity.Information;
import hilelll.collections.practice1.hw11remake.entity.InitializationData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Information information = new Information();
        InitializationData initializationData = new InitializationData();
        information = initializationData.fillCollections(information);

        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        generateUsersByList(numbers, information);

        System.out.println(information.getNicknames());
        System.out.println(information.getEmails());
        System.out.println(information.getEmailNickname());


    }
    public static Information generateUsersByList(List<? extends Number> incomingList, Information information) {
        for (int i = 0; i < incomingList.size(); i++) {
            information.getNicknames().add(String.valueOf(i));
            information.getEmails().add(i + "@mail.ua");
            information.getEmailNickname().put(String.valueOf(i), i + "@mail.ua");
        }
        return information;
    }

}
