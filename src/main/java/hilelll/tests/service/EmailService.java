package hilelll.tests.service;

import hilelll.tests.exception.WrongEmailException;

public class EmailService {
    public boolean validate(String email) throws WrongEmailException {
        if (email == null || email.isBlank()) {
            throw new WrongEmailException("Email is empty or null");
        }
//            throw new WrongEmailException("Email is incorrect " + email);
            return email.contains("@");
    }
}
