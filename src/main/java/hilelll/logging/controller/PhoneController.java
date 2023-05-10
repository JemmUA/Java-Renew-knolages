package hilelll.logging.controller;

import hilelll.logging.entity.Phone;
import hilelll.logging.service.PhoneService;
//import logging.util.LoggerUtil;
import org.apache.log4j.Logger;

public class PhoneController {
    private PhoneService phoneService = new PhoneService();
    //    private Logger logger = LoggerUtil.getLogger(PhoneController.class);
    private Logger logger = Logger.getLogger(PhoneController.class);
    public void checkPhoneNumber(Phone phone) {
//        logger.log(Level.INFO, phone.toString());
        logger.debug(phone.toString());
        if (phone.getNumber() == null) {
            logger.error("Phone Number isn NULL");
        }
        phoneService.checkPhoneNumber(phone.getNumber());

    }
}
