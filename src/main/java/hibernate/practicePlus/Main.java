package hibernate.practicePlus;

import hibernate.practicePlus.model.Apprentice;
import hibernate.practicePlus.model.Sport;
import hibernate.practicePlus.service.ApprenticeService;
import hibernate.practicePlus.service.SportService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ApprenticeService apprenticeService = new ApprenticeService();
        SportService sportService = new SportService();

        HashSet<Sport> sports = new HashSet<>();
        HashSet<Sport> sports2 = new HashSet<>();
        HashSet<Sport> sports3 = new HashSet<>();
        HashSet<Apprentice> apprentices = new HashSet<>();

        Apprentice apprentice1 = new Apprentice();
        apprentice1.setName("Den");
        Apprentice apprentice2 = new Apprentice();
        apprentice2.setName("Ira");
        Apprentice apprentice3 = new Apprentice();
        apprentice3.setName("Bob");
        Apprentice apprentice4 = new Apprentice();
        apprentice4.setId(333);
        apprentice4.setName("Noris");
//        apprentice4.setSports(sports2);

        Sport sprint = new Sport();
        sprint.setSport("sprint");
        Sport box = new Sport();
        box.setSport("box");
        Sport soccer = new Sport();
        soccer.setSport("soccer");

//        sportService.save(sprint);
//        sportService.save(box);
//        sportService.save(soccer);

        apprentices.add(apprentice1);
        apprentices.add(apprentice2);
        apprentices.add(apprentice3);

        sports.add(sprint);
        sports.add(box);
        sports.add(soccer);

        sports2.add(sprint);
        sports3.add(soccer);

        sprint.setApprentices(apprentices);
        soccer.setApprentices(apprentices);
        box.setApprentices(apprentices);


        sports3.forEach(System.out::println);
        sports.forEach(System.out::println);
//        apprentice1.setSports(sports);
//        apprentice2.setSports(sports2);
//        apprentice3.setSports(sports3);
//        apprentice4.setSports(sports2);


//        apprenticeService.save(apprentice1);
//        apprenticeService.save(apprentice2);
//        apprenticeService.save(apprentice3);
        apprenticeService.save(apprentice4);
    }
}
