package hilelll.logging;

import hilelll.logging.controller.PhoneController;
import hilelll.logging.entity.Phone;

public class Main {
    public static void main(String[] args) {
//        System.err.println("It's not error :))");

        PhoneController phoneController = new PhoneController();
        Phone mobile = new Phone(7, "mobile", null);
        phoneController.checkPhoneNumber(mobile);

    }
}
