package tests.service;

import tests.Entity.Order;
import tests.exception.WrongEmailException;

public class OrderService {
    private EmailService emailService = new EmailService();

    public Order create(String name, String email) throws WrongEmailException {
        emailService.validate(email);
        return new Order(3, name, email);
    }
}
