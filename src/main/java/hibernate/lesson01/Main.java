package hibernate.lesson01;

import hibernate.lesson01.model.User;
import hibernate.lesson01.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

//        User user = new User();
//        user.setName("Rib");
//        user.setSurname("Braer");
//        user.setEmail("rib@mail.ua");
//        user.setPassword("dfdfew");
//        user.setAge(7);

//        userService.save(user);
//
        User userById = userService.getById(4);
        System.out.println(userById);

//        List<User> users = userService.gerAll();
//        users.forEach(System.out::println);

    }
}
