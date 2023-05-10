package hilelll.tests;

import hilelll.tests.exception.WrongEmailException;
import hilelll.tests.service.EmailService;

public class Main {
    public static void main(String[] args) throws WrongEmailException {

        EmailService emailService = new EmailService();
        System.out.println(emailService.validate("mail_mail.ua"));
        System.out.println(emailService.validate("mail@mail.ua"));
        System.out.println(emailService.validate(null));

    }
}
