package hilelll.tests.service;

import hilelll.tests.exception.WrongEmailException;
import hilelll.tests.Entity.Order;

public class OrderService {
    private EmailService emailService = new EmailService();

    public Order create(String name, String email) throws WrongEmailException {
        emailService.validate(email);
        return new Order(3, name, email);
    }
}
