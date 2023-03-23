package logging;

import logging.controller.PhoneController;
import logging.entity.Phone;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        System.err.println("It's not error :))");

        PhoneController phoneController = new PhoneController();
        Phone mobile = new Phone(7, "mobile", null);
        phoneController.checkPhoneNumber(mobile);

    }
}
