package hilelll.logging.service;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class PhoneService {
    Logger logger = Logger.getLogger(PhoneService.class);
    public void checkPhoneNumber(Integer integer) {
        logger.debug(integer);
    }
}
